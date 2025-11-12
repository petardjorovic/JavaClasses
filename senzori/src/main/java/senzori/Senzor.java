package senzori;

import java.util.List;

public class Senzor implements Runnable {
    final private List<Double> lista;

    public Senzor(List<Double> lista){
        this.lista = lista; 
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                double temp = Math.random() * 20 + 30; // [30 - 50] *C
                synchronized (this.lista){
                    this.lista.add(temp);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
