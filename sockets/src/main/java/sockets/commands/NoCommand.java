package sockets.commands;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import sockets.server.Server;

public class NoCommand extends Command {

    public NoCommand(Server server, Socket client) {
        super(server, client);
    }

    @Override
    public void execute(String command) {
        try {
            PrintWriter out = new PrintWriter(getClient().getOutputStream());
            out.println("-");
            out.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
