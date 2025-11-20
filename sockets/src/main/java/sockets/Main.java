package sockets;

import java.io.IOException;

import sockets.data.TemperatureMeasurementBatabase;
import sockets.server.Server;

public class Main {
    public static void main(String[] args) {
        try {
            Server server = new Server(new TemperatureMeasurementBatabase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}