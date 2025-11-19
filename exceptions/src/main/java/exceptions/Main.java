package exceptions;

import java.util.Scanner;

public class Main {
    public static int getBrojRedova(){
        System.out.print("Unesite broj redova matrice: ");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static int getBrojKolona(){
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj kolona matrice: ");
        return s.nextInt();
    }

    public static void main(String[] args) {
        Matrica m1;

        int brojRedova = getBrojRedova();
        int brojKolona = getBrojKolona();

        while (true) {
            try {
                m1 = new Matrica(brojRedova, brojKolona);
                break;
            } catch (BadRowCountException brce) {
                System.out.println("Uneli ste neispravan broj redova.");
                brojRedova = getBrojRedova();
            } catch (BadColumnCountException bcce){
                System.out.println("Uneli ste neispravan broj kolona.");
                brojKolona = getBrojKolona();
            }   
        }

        try {
            m1.set(6, 10, 3.1415);
        } catch (BadRowIndexException e) {
            System.out.println(e.getMessage());
        } catch (BadColumnIndexException e){
            System.out.println(e.getMessage());
        }
    }
}