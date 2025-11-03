package com.example;

public class Ruka {
    public enum Stanje { SAVIJENA, ISPRUZENA };
    private Stanje stanje = Stanje.ISPRUZENA;

    public void savij(){
        this.stanje = Stanje.SAVIJENA;
    }

    public void ispruzi(){
        this.stanje = Stanje.ISPRUZENA;
    }

    public Stanje getStanje(){
        return this.stanje;
    }

    public boolean jeSavijena(){
        return this.stanje == Stanje.SAVIJENA;
    }

    public boolean jeIspruzena(){
        return this.stanje == Stanje.ISPRUZENA;
    }

}
