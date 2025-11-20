package sockets.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import sockets.commands.AverageCommand;
import sockets.commands.Command;
import sockets.commands.ExitCommand;
import sockets.commands.InsertCommand;
import sockets.commands.NoCommand;

public class ClientProcessor implements Runnable {
    private final Server server;
    private final Socket client;
    private Map<String, Class> commandMap = new HashMap<>();

    public ClientProcessor(Server server, Socket client) {
        this.server = server;
        this.client = client;

        this.commandMap.put("EXIT", ExitCommand.class);
        this.commandMap.put("AVERAGE", AverageCommand.class);
        this.commandMap.put("INSERT", InsertCommand.class);
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
        // out.println("Welcome!");
        out.println("OK");
        out.flush();

        while (true) {
            String command = getCommand(out, in);

            Class klasa = getClassFromCommand(command);

            try {
                Command cmd = (Command) klasa.getDeclaredConstructor(new Class[] {Server.class, Socket.class})
                                             .newInstance(new Object[] {server, client});
                cmd.execute(command);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private Class getClassFromCommand(String command) {
        Scanner scanner = new Scanner(command);
        String commandName = scanner.next().trim().toUpperCase();

        if(commandMap.containsKey(commandName)){
            return commandMap.get(commandName);
        }

        return NoCommand.class;
    }

    private String getCommand(PrintWriter out, Scanner in){
        String command = "";

        while(command.equals("")){
            // out.print("? ");
            // out.flush();
            
            try {
                command = in.nextLine().trim().toUpperCase();
            } catch (Exception e) {
                command = "EXIT";
            }
        }

        return command;
    }
}
