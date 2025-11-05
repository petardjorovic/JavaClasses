package com.example.jedinice;

public class Duzina {
    private double metri;

    private Duzina(double metri){
        this.metri = metri;
    }

    public static Duzina fromMeters(double metri){
        return new Duzina(metri);
    }

    public static Duzina fromKilometers(double kilometri){
        return new Duzina(kilometri * 1000.);
    }

    public double toMeters(){
        return this.metri;
    }

    public double toKilometers(){
        return this.metri / 1000.;
    }

    public void add(Duzina duzina){
        this.metri += duzina.toMeters();
    }

    public void addMeters(double metara){
        this.metri += metara;
    }

    public void addKilometers(double kilometara){
        this.metri += kilometara * 1000.;
    }
}
