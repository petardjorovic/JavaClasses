package senzori;

import java.util.List;

public class KalkulatorSrednjeVrednosti implements Runnable {
    final private List<Double> lista;
    final private long delay;

    public KalkulatorSrednjeVrednosti(List<Double> lista, int delay) {
        this.lista = lista;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(delay);

                synchronized (this.lista){

                    double sum = 0;
                    int brEl = this.lista.size();
                    
                    for(int i = 0;i < brEl;i++){
                        sum += this.lista.get(i);
                    }
                    
                    double srVr = sum / brEl;
                    System.out.println("Srednja vrednost temperature je: " + srVr + " C*");
                    
                    lista.clear();
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
