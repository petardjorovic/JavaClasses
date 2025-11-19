package exceptions;

public class BadColumnCountException extends Exception {
    public BadColumnCountException(int unetiBrojKolona){
        super("Broj kolna matrice ne moze da bude " + unetiBrojKolona + " mora da buti veci od 0.");
    }
}
