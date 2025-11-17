package groupb;

import groupb.Vrata.Stanje;

public class ZatvaranjeVrata extends Zadatak {
    private Vrata vrata;

    public ZatvaranjeVrata(Vrata vrata) {
        this.vrata = vrata;
    }

    @Override
    public void execute() {
        if(vrata.getStanje() == Stanje.ZATVORENA){
            System.out.println("Vrata su vec zatvorena.");
            return;
        }

        System.out.println("Zatvaram vrata...");
        vrata.setStanje(Stanje.ZATVORENA);
    }

    @Override
    public String getName() {
        return "Zatvarac vrata";
    }

}
