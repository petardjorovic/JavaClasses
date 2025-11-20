package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProcessor implements Runnable {
    private final Server server;
    private final Socket client;

    public ClientProcessor(Server server, Socket client) {
        this.server = server;
        this.client = client;
    }

    @Override
    public void run() {
        try {
            PrintWriter printWriter = new PrintWriter(client.getOutputStream());
            Scanner scanner = new Scanner(client.getInputStream()); 
            proccess(printWriter, scanner);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void proccess(PrintWriter out, Scanner in) throws IOException {
        out.println("Welcome!");
        out.flush();

        while (true) {
            String command = getCommand(out, in);

            if(command.equals("EXIT")){
                out.println("Good bye!");
                out.flush();
                client.close();
                break;
            }

            if(command.equals("AVERAGE")){
                double average = server.getDatabase().getAverageTemperature();
                out.println("Average temperature is " + average);
                out.flush();
                continue;
            }

            // INSERT TIMESTAMPS VALUES
            if(command.startsWith("INSERT ")){
                Scanner commandScanner = new Scanner(command);
                commandScanner.next(); // skip INSERT
                long timestamp = commandScanner.nextLong();
                double value = commandScanner.nextDouble();
                server.getDatabase().add(new TemperatureMeasurement(timestamp, value));
                out.println("Added " + timestamp + " = " + value);
                out.flush();
                // commandScanner.close();
                continue;
            }

            out.println("Unknown command...");
            out.flush();

        }
    }

    private String getCommand(PrintWriter out, Scanner in){
        String command = "";

        while(command.equals("")){
            out.print("? ");
            out.flush();
            
            try {
                command = in.nextLine().trim().toUpperCase();
            } catch (Exception e) {
                command = "EXIT";
            }
        }

        return command;
    }
}
