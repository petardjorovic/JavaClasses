package adapter;

public class RernaNaGasAdapter implements UniverzalniUredjajZaPecenje {
    final private RernaNaGas rernaNaGas;

    public RernaNaGasAdapter(RernaNaGas rernaNaGas){
        this.rernaNaGas = rernaNaGas;
    }

    @Override
    public void iskljuci() {
        this.rernaNaGas.zatvoriVentil();
        this.rernaNaGas.setTemperatura(0);
        this.rernaNaGas.setMod(Rerna.Mod.DOLE);    
    }

    @Override
    public void zagrevanje() {
        this.rernaNaGas.otvoriVentil();
        this.rernaNaGas.setTemperatura(65);
        this.rernaNaGas.setMod(Rerna.Mod.VENTIALTOR_I_GORE);
    }

    @Override
    public void pecenje() {
        this.rernaNaGas.otvoriVentil();
        this.rernaNaGas.setTemperatura(175);
        this.rernaNaGas.setMod(Rerna.Mod.DOLE_I_GORE);
    }

    @Override
    public void susenje() {
        this.rernaNaGas.otvoriVentil(); 
        this.rernaNaGas.setTemperatura(105);
        this.rernaNaGas.setMod(Rerna.Mod.VENTIALTOR_I_GORE);
    }

    @Override
    public void crisp() {
        this.rernaNaGas.otvoriVentil();
        this.rernaNaGas.setTemperatura(275);
        this.rernaNaGas.setMod(Rerna.Mod.DOLE_I_GORE);
    }

    @Override
    public String toString() {
        return "RernaNaGasAdapter [rernaNaGas=" + rernaNaGas + "]";
    }

}
