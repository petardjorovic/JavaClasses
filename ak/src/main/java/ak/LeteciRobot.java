package ak;

final public class LeteciRobot extends Robot {
    private double maksimalnaVisina;

    public LeteciRobot(double tezinaKG, String ime, String lozinka, double maksimalnaVisina){
        super(tezinaKG, ime, lozinka);
        this.maksimalnaVisina = maksimalnaVisina;
    }

    public double getMaksimalnaVisina(){
        return maksimalnaVisina;
    }

    @Override
    final public double getTezina(){
        return super.getTezina();
    }

    @Override
    protected void izvrsenjeNaredbe(String naredjenje){
        if(naredjenje.equals("POLETI")){
            System.out.println(getIme() + " je poleteo.");
        } else if(naredjenje.equals("SLETI")){
            System.out.println(getIme() + " je sleteo.");
        }else{
            System.out.println(getIme() + " ne poznaje naredjenje.");
        }
    }
}
