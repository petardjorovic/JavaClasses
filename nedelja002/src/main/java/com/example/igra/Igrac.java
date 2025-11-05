package com.example.igra;

import com.example.jedinice.Brzina;
import com.example.jedinice.Ugao;

public class Igrac extends PokretanObjekat {
    private String ime = "";
    private double snaga = 0;
    private double zivot = 0;

    public Igrac(Lokacija lokacija,String slika,Brzina brzina){
        super(lokacija, slika, brzina, Ugao.fromDegrees(0));
    }

    public void setIme(String ime){
        this.ime = ime;
    }

    public String getIme(){
        return ime;
    }

    public void setSnaga(double snaga){
        this.snaga = snaga;
    }

    public double getSnaga(){
        return snaga;
    }

    public void setZivot(double zivot){
        this.zivot = zivot;
    }

    public double getZivot(){
        return zivot;
    }
}
