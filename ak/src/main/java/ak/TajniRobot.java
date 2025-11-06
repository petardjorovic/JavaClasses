package ak;

public class TajniRobot extends Robot {


    public TajniRobot(double tezinaKG, String ime, String lozinka){
        super(tezinaKG, ime, lozinka);
    }

    @Override
    public double getTezina(){
        return 0;
    }

    @Override
    protected void izvrsenjeNaredbe(String naredjenje){

    }
}
