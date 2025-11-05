package com.example.igra;

import com.example.jedinice.Duzina;
import com.example.jedinice.Ugao;

public class Lokacija {
    private Duzina x;
    private Duzina y;

    public Lokacija(Duzina x, Duzina y){
        this.x = x;
        this.y = y;
    }

    public Duzina getX(){
        return x;
    }

    public Duzina getY(){
        return y;
    }

    public void move(Ugao ugao, Duzina duzina){
        x.add(Duzina.fromMeters(duzina.toMeters() * Math.cos(ugao.toRadians())));
        y.add(Duzina.fromMeters(duzina.toMeters() * Math.sin(ugao.toRadians())));
    }
}
