package sockets.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import sockets.data.TemperatureMeasurementBatabase;

public class Server {
    private final TemperatureMeasurementBatabase database;
    private final ServerSocket serverSocket;

    public Server(TemperatureMeasurementBatabase database) throws IOException {
        this.database = database;
        serverSocket = new ServerSocket(7633, 100);
        serverLoop();
    }
    
    public TemperatureMeasurementBatabase getDatabase() {
        return database;
    }

    private void serverLoop() throws IOException {
        while(serverSocket.isBound() && !serverSocket.isClosed()){
            Socket client = serverSocket.accept();
            ClientProcessor clientProcessor = new ClientProcessor(this, client);
            new Thread(clientProcessor).start();
        }
    }
}
