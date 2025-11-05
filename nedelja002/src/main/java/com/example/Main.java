package com.example;

import java.util.LinkedList;
import java.util.List;

import com.example.igra.Lokacija;
import com.example.igra.Objekat;
import com.example.igra.Vuk;
import com.example.jedinice.Brzina;
import com.example.jedinice.Duzina;
import com.example.jedinice.Vreme;

public class Main {
    public static void main(String[] args) {
        List<Objekat> listaObjekataIgre = new LinkedList<>();

        Vuk v1 = new Vuk(new Lokacija(
                Duzina.fromMeters(10), 
                Duzina.fromMeters(12)
                ), "slike/vuk.png", 
                Brzina.fromKilometersPerHours(40), 
                "crna");

        Vuk v2 = new Vuk(new Lokacija(
                Duzina.fromMeters(10), 
                Duzina.fromMeters(13)
                ), "slike/vuk.png", 
                Brzina.fromKilometersPerHours(45), 
                "sivi");

        listaObjekataIgre.add(v1);
        listaObjekataIgre.add(v2);

        System.out.println(listaObjekataIgre.size());

        v1.move(Vreme.fromMinutes(2));
        v2.move(Vreme.fromMinutes(2));

        System.out.println(listaObjekataIgre.size());
        /* 
         * 2D
         *      - objekti (x.y,slika)
         *          - nepokretni (naziv)
         *          - pokretni (brzina)
         *              - igraci (naziv, snaga, zivot) @ funkcije za kretanje
         *              - neprijatelji (snaga, zivot)
         *                  - ork
         *                  - vuk
         *                  - ...
        */
       
    }

    
}