package oopa_20081940;

public class StudentMaster extends Student {

    public StudentMaster(String ime, String prezime, String smer, String indeks) {
        super(ime, prezime, smer, indeks);
    }

    @Override
    public String toString() {
        if(!isValid()){
            return "Ovaj objekat nije ispravan";
        }

        return "Moje ime je " + getIme() + " " + getPrezime() + ". Student sam smera " + getSmer() + " na master akademskim studijama.";
    }

}
