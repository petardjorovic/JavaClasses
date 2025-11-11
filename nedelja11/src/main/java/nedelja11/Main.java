package nedelja11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Kandidat> listaKandidata = new ArrayList<>();
        listaKandidata.add(new Kandidat("Pera", "Peric", "peraperic@gmail.com")
                                .dodajZnanje("programiranje", 18)
                                .dodajZnanje("engleski", 24)
                                .dodajZnanje("baze podataka", 12));

        listaKandidata.add(new Kandidat("Ivan", "Ivanovic", "ivan@gmail.com")
                                .dodajZnanje("dizajn", 32)
                                .dodajZnanje("engleski", 24)
                                .dodajZnanje("baze podataka", 10));

        for(Kandidat k : listaKandidata){
        System.out.println(k);
    }
    }
}