package oopa_20081940;

abstract public class Student implements Validatable {
    final private String ime, prezime, smer, indeks;

    public Student(String ime, String prezime, String smer, String indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.smer = smer;
        this.indeks = indeks;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getSmer() {
        return smer;
    }

    public String getIndeks() {
        return indeks;
    }

    @Override
    public boolean isValid() {
        if(ime.length() < 2){
            return false;
        }

        if(prezime.length() < 2){
            return false;
        }

        if(smer.length() < 2){
            return false;
        }

        return indeks.matches("^[0-9]{10}$");
    }

    @Override
    public abstract String toString();
}
