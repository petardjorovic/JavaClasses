package exceptions;

public class BadRowCountException extends Exception {
    public BadRowCountException(int unetiBrojRedova){
        super("Broj redova matrice ne moze da bude " + unetiBrojRedova + " mora da buti veci od 0.");
    }
}
