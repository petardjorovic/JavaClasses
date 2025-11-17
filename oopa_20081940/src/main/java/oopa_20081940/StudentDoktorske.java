package oopa_20081940;

public class StudentDoktorske extends Student {

    public StudentDoktorske(String ime, String prezime, String smer, String indeks) {
        super(ime, prezime, smer, indeks);
    }

    @Override
    public String toString() {
        if(!isValid()){
            return "Ovaj objekat nije ispravan";
        }

        return "Zovem se " + getIme() + " " + getPrezime() + ". Doktorand sam na smeru " + getSmer() + ".";
    }

}
