package adapter;

public class RernaAdapter implements UniverzalniUredjajZaPecenje {
    final private Rerna rerna;

    public RernaAdapter(Rerna rerna){
        this.rerna = rerna;
    }

    @Override
    public void iskljuci() {
        this.rerna.setTemperatura(0);
        this.rerna.setMod(Rerna.Mod.DOLE);
    }

    @Override
    public void zagrevanje() {
        this.rerna.setTemperatura(75);
        this.rerna.setMod(Rerna.Mod.VENTIALTOR_I_GORE);
    }

    @Override
    public void pecenje() {
        this.rerna.setTemperatura(175);
        this.rerna.setMod(Rerna.Mod.DOLE_I_GORE);
    }

    @Override
    public void susenje() {
        this.rerna.setTemperatura(105);
        this.rerna.setMod(Rerna.Mod.VENTIALTOR_I_GORE);
    }

    @Override
    public void crisp() {
        this.rerna.setTemperatura(250);
        this.rerna.setMod(Rerna.Mod.ROSTILJ);
    }

    @Override
    public String toString() {
        return "RernaAdapter: [rerna=" + rerna + "]";
    }
}
