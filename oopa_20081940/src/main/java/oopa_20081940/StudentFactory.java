package oopa_20081940;

public class StudentFactory {
    public static Student getInstance(String index, String ime, String prezime){
        int petiKarakter = Integer.parseInt(index.substring(4,5));
        if(petiKarakter >= 1 && petiKarakter <= 5){
            return getOS(index,ime,prezime);
        }

        if(petiKarakter > 5 && petiKarakter <= 7){
            return getMS(index,ime,prezime);
        }

        if(petiKarakter > 7 && petiKarakter <= 9){
            return getDS(index,ime,prezime);
        }

        return null;
    }

    public static StudentOsnovne getOS(String index, String ime, String prezime){
        int sestiKarakter = Integer.parseInt(index.substring(5,6));
        String smer = "";
        switch (sestiKarakter) {
            case 0: smer = "Informatika i racunarstvo"; break;
            case 1: smer = "Poslovna ekonomija"; break;
            case 2: smer = "Informatika i racunarstvo"; break;
            case 3: smer = "Informacione tehnologije"; break;
            case 4: smer = "Turizam i hotelijerstvo"; break;
            case 5: smer = "Softversko i info. inzenjer."; break;
            case 6: smer = "Menadzment u sportu"; break;
            case 7: smer = "Fizicko vaspitanje i sport"; break;
            case 8: smer = "Turizam i hotelijerstvo"; break;
            case 9: smer = "Grupa smerova"; break;
        }
        return new StudentOsnovne(ime, prezime, smer, index);
    } 

    public static StudentMaster getMS(String index, String ime, String prezime){
        int sestiKarakter = Integer.parseInt(index.substring(5,6));
        String smer = "";
        switch (sestiKarakter) {
            case 0: smer = "Poslovna ekonomija"; break;
            case 1: smer = "Poslovna ekonomija"; break;
            case 2: smer = "Poslovna ekonomija"; break;
            case 3: smer = "Interna revizija i forenzika"; break;
            case 4: smer = "Inzenjerski menadzment"; break;
            case 5: smer = "Savremene info. tehnologije"; break;
            case 6: smer = "Savremene info. tehnologije"; break;
            case 7: smer = "Savremene info. tehnologije"; break;
            case 8: smer = "Elektronika i racunarstvo"; break;
            case 9: smer = "Grupa smerova"; break;
        }
        return new StudentMaster(ime, prezime, smer, index);
    } 

    public static StudentDoktorske getDS(String index, String ime, String prezime){
        int sestiKarakter = Integer.parseInt(index.substring(5,6));
        String smer = "";
        switch (sestiKarakter) {
            case 0: smer = "Napredni sistemi zastite"; break;
            case 1: smer = "Savrem, posl. odlucivanje"; break;
            case 2: smer = "Menadzment u turizmu"; break;
            case 3: smer = "Napredni sistemi zastite"; break;
            case 4: smer = "Napredni sistemi zastite"; break;
            case 5: smer = "Elektroteh. i racunarstvo"; break;
            case 6: smer = "Elektroteh. i racunarstvo"; break;
            case 7: smer = "Grupa smerova"; break;
            case 8: smer = "Grupa smerova"; break;
            case 9: smer = "Grupa smerova"; break;
        }
        return new StudentDoktorske(ime, prezime, smer, index);
    } 
}
