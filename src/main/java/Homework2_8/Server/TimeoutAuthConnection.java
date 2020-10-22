package Homework2_8.Server;

import Homework2_8.Server.TCPConnection.TCPConnection;

public class TimeoutAuthConnection implements Runnable {
    TCPConnection connection;

    @Override
    public void run() {
        if (connection.getName().isEmpty()) connection.disconnect();
    }

    public TimeoutAuthConnection(TCPConnection connection) {
        this.connection = connection;
    }
}
