package enumtypes;

public class Automobil {
    private final VrstaGoriva vrstaGoriva;
    private final String model;

    public Automobil(VrstaGoriva vrstaGoriva, String model){
        this.vrstaGoriva = vrstaGoriva;
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public VrstaGoriva getVrstaGoriva(){
        return vrstaGoriva;
    }
}
