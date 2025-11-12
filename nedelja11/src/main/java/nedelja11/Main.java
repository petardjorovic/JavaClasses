package nedelja11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Kandidat> listaKandidata = new ArrayList<>();

        KandidatFilter programeri = kandidat -> {
            if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("programiranje") < 12){
                return false;
            }

            if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("baze podataka") < 12){
                return false;
            }

            if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("engleski") < 24){
                return false;
            }

            return true;
        };

        KandidatFilter menadzeri = kandidat -> {
            if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("menadzment") < 18){
                return false;
            }

            if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("poslovna korespodencija") < 12){
                return false;
            }

            if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("engleski") < 24){
                return false;
            }

            return true;
        };

        listaKandidata.add(new Kandidat("Pera", "Peric", "peraperic@gmail.com")
                                .dodajZnanje("programiranje", 18)
                                .dodajZnanje("engleski", 24)
                                .dodajZnanje("baze podataka", 12)
                                .setAdresa("Adresa 1"));

        listaKandidata.add(new Kandidat("Milan", "Milanovic", "milan@gmail.com")
                                .dodajZnanje("programiranje", 19)
                                .dodajZnanje("nemacki", 27)
                                .dodajZnanje("engleski", 29)
                                .dodajZnanje("baze podataka", 14)
                                .setAdresa("Adresa 2"));

        listaKandidata.add(new Kandidat("Ivan", "Ivanovic", "ivan@gmail.com")
                                .dodajZnanje("dizajn", 32)
                                .dodajZnanje("engleski", 24)
                                .dodajZnanje("poslovna korespodencija", 15)
                                .dodajZnanje("baze podataka", 10)
                                .setAdresa("Adresa 3"));

        listaKandidata.add(new Kandidat("Zoran", "Zoric", "zoran@gmail.com")
                                .dodajZnanje("menadzment", 32)
                                .dodajZnanje("engleski", 27)
                                .dodajZnanje("marketing", 21)
                                .dodajZnanje("poslovna korespodencija", 18)
                                .setAdresa("Adresa 4"));

    listaKandidata.stream()
                  .filter(k -> programeri.odgovora(k))
                  .forEach(k -> System.out.println("Kandidat: " + k));

    //     for(Kandidat k : listaKandidata){
    //     System.out.println(k);
    // }
    }
}