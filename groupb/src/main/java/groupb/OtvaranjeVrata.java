package groupb;

import groupb.Vrata.Stanje;

public class OtvaranjeVrata extends Zadatak {
    private Vrata vrata;

    public OtvaranjeVrata(Vrata vrata) {
        this.vrata = vrata;
    }

    @Override
    public void execute() {
        if(vrata.getStanje() == Stanje.OTVORENA){
            System.out.println("Vrata su vec otvorena.");
            return;
        }

        System.out.println("Otvaram vrata...");
        vrata.setStanje(Stanje.OTVORENA);
    }

    @Override
    public String getName() {
        return "Otvarac vrata";
    }

}
