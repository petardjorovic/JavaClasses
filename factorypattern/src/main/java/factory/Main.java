package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Unesite ime datoteke sa konfiguracionim parametrima: ");

        String imeDatoteke = s.nextLine();

        ConfigReaderFactory crf = new ConfigReaderFactory(imeDatoteke);
        try {
            ConfigReader cr = crf.getConfigReader();
            String adminUsername = cr.readProperty("ADMIN_USERNAME");
            System.out.println("Trazena knfiguracija je " + adminUsername);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }
}