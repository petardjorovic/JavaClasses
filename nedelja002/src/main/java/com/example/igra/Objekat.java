package com.example.igra;


public abstract class Objekat {
    private Lokacija lokacija;
    private String slika;

    public Objekat(Lokacija lokacija,String slika){
        this.lokacija = lokacija;
        this.slika = slika;
    }

    public Lokacija getLokacija(){
        return lokacija;
    }

    public String getSlika(){
        return slika;
    }
}
