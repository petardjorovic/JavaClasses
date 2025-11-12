package threads;

public class Funkcija implements Runnable {
    final private long n;

    public Funkcija(long n){
        this.n = n;
    }

    public void calc(){
        System.out.println("Pocinjem proracun za n = " + n);
        long start = System.currentTimeMillis();
        long sum = 1l;
        for(long i = 1;i <= n;i += 1l){
            sum += i;
        }
        System.out.println("f(" + n + ") = " + sum + ", za " + (System.currentTimeMillis() - start) + "ms.");
    }

    @Override
    public void run() {
        calc();
    }
}
