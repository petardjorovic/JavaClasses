package adapter;

public class Main {
    public static void main(String[] args) {
        RernaNaGas r = new RernaNaGas();

        RernaNaGasAdapter ra = new RernaNaGasAdapter(r);

        ra.crisp();

        System.out.println(r);
    }
}