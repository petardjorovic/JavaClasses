package sockets;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            TemperatureMeasurementBatabase database = new TemperatureMeasurementBatabase();
            Server server = new Server(database);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}