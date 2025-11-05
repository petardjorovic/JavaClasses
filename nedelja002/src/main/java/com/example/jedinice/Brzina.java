package com.example.jedinice;

public class Brzina {
    private double mps;

    private Brzina(double mps){
        this.mps = mps;
    }

    public static Brzina fromMetersPerSeconds(double mps){
        return new Brzina(mps);
    }

    public static Brzina fromKilometersPerHours(double kmph){
        return new Brzina(kmph / 3.6);
    }

    public double toMetersPerSecond(){
        return this.mps;
    }

    public double toKilometersPerHour(){
        return this.mps * 3.6;
    }

    public void add(Brzina brzina){
        this.mps += brzina.toMetersPerSecond();
    }

    public Duzina predjeniPut(Vreme vreme){
        return Duzina.fromMeters(this.mps * vreme.toSeconds());
    }
}
