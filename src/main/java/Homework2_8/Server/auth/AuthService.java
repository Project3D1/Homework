package Homework2_8.Server.auth;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}
