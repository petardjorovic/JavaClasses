package adapter;

public class Rerna {
    public enum Mod {DOLE, GORE, DOLE_I_GORE, VENTIALTOR_I_GORE, ROSTILJ }

    private Mod mod;
    private int temperatura;

    public Rerna(){}

    public void setMod(Mod mod) {
        this.mod = mod;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    
    public Mod getMod() {
        return mod;
    }
    
    public int getTemperatura() {
        return temperatura;
    }    
    
    @Override
    public String toString() {
        return "Rerna [mod=" + mod + ", temperatura=" + temperatura + "]";
    }
}
