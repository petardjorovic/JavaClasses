package nedelja11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kandidat {
    final private String ime, prezime;
    private String adresa,email;
    private Map<String, Integer> znanja;

    public Kandidat(String ime, String prezime, String email){
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.adresa = "NEPOZNATA";
        this.znanja = new HashMap<>();
    }

    public Kandidat setEmail(String email) {
        this.email = email;
        return this;
    }

    public Kandidat setAdresa(String adresa) {
        this.adresa = adresa;
        return this;
    }

    public String getIme() {
        return ime;
    }
    
    public String getPrezime() {
        return prezime;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getAdresa() {
        return adresa;
    }
    
    public Kandidat dodajZnanje(String znanje, int brojMeseciRadnogIskustva){
        this.znanja.put(znanje, brojMeseciRadnogIskustva);
        return this;
    }

    public int getBrojMeseciRadnogIskustvaZaZnanja(String znanje){
        if(this.znanja.containsKey(znanje)){
            return this.znanja.get(znanje);
        }

        return 0;
    }

    private String getZnanjaList(){
        List<String> lista = new ArrayList<>();
        for(String znanje : this.znanja.keySet()){
            lista.add(znanje + ": " + this.znanja.get(znanje));
        }
        
        return String.join("; ", lista);
    }

    @Override
    public String toString() {
        return "Kandidat [ime=" + ime + ", prezime=" + prezime + ", email=" + email + ", adresa=" + adresa + ", znanja=" + getZnanjaList() + "]";
    }

    
}
