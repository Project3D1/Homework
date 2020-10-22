package Homework2_7;

import Homework2_8.Server.auth.AuthService;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public class ChatServer {

    private static final Pattern AUTH_PATTERN = Pattern.compile ("^/auth (.+) (.+)$");

    private static AuthService authService = new AuthServiceImpl ();

    private static Map<String, ClientHandler> clientHandlerMap = Collections.synchronizedMap (new HashMap<> ());
    private AbstractSerializer out;
    private String username;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket (7777)) {
            System.out.println ("Server started!");
            while (true) {
                Socket socket = serverSocket.accept ();
                DataInputStream inp = new DataInputStream (socket.getInputStream ());
                DataOutputStream out = new DataOutputStream (socket.getOutputStream ());
                System.out.println ("New client connected!");

                try {
                    String authMessage = inp.readUTF ();
                    Matcher matcher = AUTH_PATTERN.matcher (authMessage);
                    if (matcher.matches ()) {
                        String username = matcher.group (1);
                        String password = matcher.group (2);
                        if (authService.authUser (username, password)) {
                            clientHandlerMap.put (username, new ClientHandler (username, socket));
                            out.writeUTF ("/auth successful");
                            out.flush ();
                            System.out.printf ("Authorization for user %s successful%n", username);
                        } else {
                            System.out.printf ("Authorization for user %s failed%n", username);
                            out.writeUTF ("/auth fails");
                            out.flush ();
                            socket.close ();
                        }
                    } else {
                        System.out.printf ("Incorrect authorization message %s%n", authMessage);
                        out.writeUTF ("/auth fails");
                        out.flush ();
                        socket.close ();
                    }
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    public void sendMessage(String username, String msg) {

        try {
            System.out.println ("->Клиент" + (this.username != null ? " " + this.username : "") + ": " + msg);

            out.writeUTF (msg);
            out.flush ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

    public String getName() {
        return username;
    }


}
