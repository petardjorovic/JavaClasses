package sockets.commands;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import sockets.data.TemperatureMeasurement;
import sockets.server.Server;

public class InsertCommand extends Command {

    public InsertCommand(Server server, Socket client) {
        super(server, client);
    }

    @Override
    public void execute(String command) {
        try {
            PrintWriter out = new PrintWriter(getClient().getOutputStream());;
            Scanner commandScanner = new Scanner(command);
            commandScanner.next(); // skip INSERT
            long timestamp = commandScanner.nextLong();
            double value = commandScanner.nextDouble();
            getServer().getDatabase().add(new TemperatureMeasurement(timestamp, value));
            out.println("OK");
            out.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
    }

}
