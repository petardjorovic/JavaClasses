package client_example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7633);

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());

            System.out.println(in.nextLine());

            out.println("INSERT 987511 29.45");
            out.flush();
            System.out.println(in.nextLine());
            out.println("INSERT 987512 19.15");
            out.flush();
            System.out.println(in.nextLine());
            out.println("INSERT 987513 27.5");
            out.flush();
            System.out.println(in.nextLine());
            out.println("INSERT 987514 23.71");
            out.flush();
            System.out.println(in.nextLine());
            
            out.println("AVERAGE");
            out.flush();
            System.out.println(in.nextLine());
            
            out.println("EXIT");
            out.flush();
        } catch (Exception e) {
            System.out.println("odavde je greska");
        }
    }
}