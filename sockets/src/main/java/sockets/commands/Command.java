package sockets.commands;

import java.net.Socket;

import sockets.server.Server;

public abstract class Command {
    private final Server server;
    private final Socket client;

    public Command(Server server, Socket client) {
        this.server = server;
        this.client = client;
    }

    protected Server getServer() {
        return server;
    }
    
    protected Socket getClient() {
        return client;
    }
       
    abstract public void execute(String command);
}
