package com.example.igra;

import com.example.jedinice.Brzina;
import com.example.jedinice.Ugao;

public abstract class Neprijatelj  extends PokretanObjekat {
    private double snaga = 0;
    private double zivot = 0;

    public Neprijatelj(Lokacija lokacija,String slika,Brzina brzina){
        super(lokacija, slika, brzina, Ugao.fromDegrees(0));
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
