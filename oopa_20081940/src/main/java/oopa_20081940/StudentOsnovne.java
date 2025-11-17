package oopa_20081940;

public class StudentOsnovne extends Student {

    public StudentOsnovne(String ime, String prezime, String smer, String indeks) {
        super(ime, prezime, smer, indeks);
    }

    @Override
    public String toString() {
        if(!isValid()){
            return "Ovaj objekat nije ispravan";
        }

        return "Ja sam " + getIme() + " " + getPrezime() + ". Student sam osnovnih studija na smeru " + getSmer() + ".";
    }

}
