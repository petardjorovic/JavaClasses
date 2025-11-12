package senzori;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Double> mere = new ArrayList<>();
        
        new Thread(new Senzor(mere)).start();
        new Thread(new Senzor(mere)).start();
        new Thread(new Senzor(mere)).start();
        new Thread(new Senzor(mere)).start();
        new Thread(new Senzor(mere)).start();

        new Thread(new KalkulatorSrednjeVrednosti(mere, 10000)).start();
    }
}