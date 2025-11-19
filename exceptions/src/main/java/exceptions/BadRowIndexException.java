package exceptions;

public class BadRowIndexException extends Exception {
    public BadRowIndexException(int unetBrojRedova, int najveciIndeksReda){
        super("Matrica nema red na indeksu " + unetBrojRedova + ". Najveci indeks reda je " + najveciIndeksReda);
    }
}
