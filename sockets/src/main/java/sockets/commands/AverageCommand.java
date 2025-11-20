package sockets.commands;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import sockets.server.Server;

public class AverageCommand extends Command {

    public AverageCommand(Server server, Socket client) {
        super(server, client);
    }

    @Override
    public void execute(String command) {
        double average = getServer().getDatabase().getAverageTemperature();
        PrintWriter out;
        try {
            out = new PrintWriter(getClient().getOutputStream());
            out.println(average);
            out.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } 
    }

}
