package com.example;

import com.example.jedinice.Brzina;
import com.example.jedinice.Put;
import com.example.jedinice.Vreme;

public class Main {
    public static void main(String[] args) {
        
        prikaziPredjeniPut(Brzina.fromMetersPerSeconds(4), Vreme.fromHours(4));
    }

    public static void prikaziPredjeniPut(Brzina brzina, Vreme vreme){
        Put p = Put.fromMeters(brzina.toMetersPerSecond() * vreme.toSeconds());
        System.out.println("Predjeni put je: " + p.toKilometers() + "km");
    }
}