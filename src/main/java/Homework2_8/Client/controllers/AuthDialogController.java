package Homework2_8.Client.controllers;

public class AuthDialogController {
    private TextField loginField;
    private PasswordField passwordField;
    private Button authButton;

    private Network network;
    private NetworkChatClient clientApp;

    public void executeAuth(ActionEvent actionEvent) {
        String login = loginField.getText();
        String password = passwordField.getText();
        if (login == null || login.isBlank() || password == null || password.isBlank()) {
            NetworkChatClient.showNetworkError("Username and password should be not empty!", "Auth error");
            return;
        }

        String authError = network.sendAuthCommand(login, password);
        if (authError == null) {
            clientApp.openChat();
        } else {
            NetworkChatClient.showNetworkError(authError, "Auth error");
        }


    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void setClientApp(NetworkChatClient clientApp) {
        this.clientApp = clientApp;
    }
}

