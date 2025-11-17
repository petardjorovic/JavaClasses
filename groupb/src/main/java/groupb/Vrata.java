package groupb;

final public class Vrata {
    public enum Stanje { OTVORENA, ZATVORENA }
    private Stanje stanje = Stanje.ZATVORENA;

    public Vrata() {}

    public Stanje getStanje() {
        return stanje;
    }

    public void setStanje(Stanje stanje) {
        this.stanje = stanje;
    }
}
