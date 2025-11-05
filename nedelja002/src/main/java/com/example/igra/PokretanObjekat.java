package com.example.igra;

import com.example.jedinice.Brzina;
import com.example.jedinice.Ugao;
import com.example.jedinice.Vreme;

public abstract class PokretanObjekat extends Objekat {
    private Brzina brzina;
    private Ugao ugao;

    public PokretanObjekat(Lokacija lokacija,String slika,Brzina brzina, Ugao ugao){
        super(lokacija, slika);
        this.brzina = brzina;
        this.ugao = ugao;
    }

    public Brzina getBrzina(){
        return brzina;
    }

    public Ugao getUgao(){
        return ugao;
    }

    public void move(Vreme vreme){
        getLokacija().move(ugao, brzina.predjeniPut(vreme));
    }
}
