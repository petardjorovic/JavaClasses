package sockets.commands;

import java.io.IOException;
import java.net.Socket;

import sockets.server.Server;

public class ExitCommand extends Command {

    public ExitCommand(Server server, Socket client) {
        super(server, client);
    }

    @Override
    public void execute(String command) {
       try {
        getClient().close();
       } catch (IOException e) {
        System.err.print(e.getMessage());
       }
    }

}
