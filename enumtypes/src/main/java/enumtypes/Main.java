package enumtypes;

public class Main {
    public static void main(String[] args) {
        String gorivo = "  ed ";
        Automobil a1 = new Automobil(VrstaGoriva.fromSkracenica(gorivo), "Tesla 3");

        System.out.println(a1.getModel() + " " + a1.getVrstaGoriva());
    }
}