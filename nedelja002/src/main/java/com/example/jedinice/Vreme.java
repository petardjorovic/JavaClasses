package com.example.jedinice;

public class Vreme {
    private double sekunde;

    private Vreme(double sekunde){
        this.sekunde = sekunde;
    }

    public static Vreme fromSeconds(double sekunde){
        return new Vreme(sekunde);
    }

    public static Vreme fromMinutes(double minuti){
        return new Vreme(minuti * 60.);
    }

    public static Vreme fromHours(double hours){
        return new Vreme(hours * 3600.);
    }

    public double toSeconds(){
        return this.sekunde;
    }

    public double toMinutes(){
        return this.sekunde / 60.;
    }

    public double toHours(){
        return this.sekunde / 3600.;
    }

    public double toMiliseconds(){
        return this.sekunde * 1000.;
    }

    public void addSeconds(double sekunde){
        this.sekunde += sekunde;
    }

    public void addMinutes(double minuti){
        this.sekunde += minuti * 60.;
    }
}
