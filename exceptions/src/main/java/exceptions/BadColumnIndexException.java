package exceptions;

public class BadColumnIndexException extends Exception {
    public BadColumnIndexException(int unetBrojKolone, int najveciIndeksKolone){
        super("Matrica nema kolonu na indeksu " + unetBrojKolone + ". Najveci indeks kolone je " + najveciIndeksKolone);
    }
}
