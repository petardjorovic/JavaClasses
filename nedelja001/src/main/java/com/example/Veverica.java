package com.example;

public class Veverica {
    private String ime;
    private String boja;
    private Ruka levaRuka;
    private Ruka desnaRuka;
    private String staDrzi;

    public void setIme(String ime){
        this.ime = ime;
    }

    public void setBoja(String boja){
        this.boja = boja;
    }

    public Veverica(String ime, String boja){
        this.setIme(ime);
        this.setBoja(boja);
        this.levaRuka = new Ruka();
        this.desnaRuka = new Ruka();
        this.staDrzi = "NISTA";
    }

    public String getIme(){
        return this.ime;
    }

    public String getBoja(){
        return this.boja;
    }

    public String getStaDrzi(){
        return this.staDrzi;
    }

    public void savijLevuRuku(){
        this.levaRuka.savij();
        System.out.println(ime + ": je savila levu ruku." );
    }

    public void savijDesnuRuku(){
        this.desnaRuka.savij();
        System.out.println(ime + ": je savila desnu ruku." );
    }

    private void proveriDaLiMozeDaNestoDaDrzi(Ruka ruka){
        if(ruka.jeIspruzena()){
            System.out.println(ime + " : je ispustila " + staDrzi);
            staDrzi = "NISTA";
        }
    }
    
    public void ispruziLevuRuku(){
        this.levaRuka.ispruzi();
        System.out.println(ime + " : je ispruzila levu ruku." );
        proveriDaLiMozeDaNestoDaDrzi(desnaRuka);
    }

    public void ispruziDesnuRuku(){
        this.desnaRuka.ispruzi();
        System.out.println(ime + ": je ispruzila desnu ruku." );
        proveriDaLiMozeDaNestoDaDrzi(levaRuka);
    }

    public void pridrzi(String sta){
        if(levaRuka.jeSavijena() || desnaRuka.jeSavijena()){
            this.staDrzi = sta;
            System.out.println(ime + ": pridrzava " + sta );
        }else{
            System.out.println(ime + ": ne moze da pridrzi " + sta);
        }
    }
    
}