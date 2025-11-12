package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("Slucaj 1:");
        // slucaj1();
        
        System.out.println("Slucaj 2:");
        slucaj2();
     }

    public static void slucaj1(){
        long start = System.currentTimeMillis();
        Funkcija f1 = new Funkcija(1000000001);
        Funkcija f2 = new Funkcija(1800000200);
        Funkcija f3 = new Funkcija(2140000300);
        Funkcija f4 = new Funkcija(2140000300);
        Funkcija f5 = new Funkcija(2140000300);
        f1.calc();
        f2.calc();
        f3.calc();
        f4.calc();
        f5.calc();

        System.out.println("Ukupno vreme: "  + (System.currentTimeMillis() - start) + "ms");
    }

    public static void slucaj2() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Funkcija(1000000001));
        Thread t2 = new Thread(new Funkcija(1800000200));
        Thread t3 = new Thread(new Funkcija(2140000300));
        Thread t4 = new Thread(new Funkcija(2140000300));
        Thread t5 = new Thread(new Funkcija(2140000300));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("Ukupno vreme: "  + (System.currentTimeMillis() - start) + "ms");
    }
}