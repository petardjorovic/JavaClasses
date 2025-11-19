package exceptions;

public class Matrica {
    private double[][] podaci;

    public Matrica(int brojRedova, int brojKolona) throws BadRowCountException, BadColumnCountException {
        if(brojRedova < 1) {
            throw new BadRowCountException(brojRedova);
        }

        if(brojKolona < 1){
            throw new BadColumnCountException(brojKolona);
        }
        this.podaci = new double[brojRedova][brojKolona];
    }

    public void set(int red, int kolona, double vrednost) throws BadRowIndexException, BadColumnIndexException{
        if(red >= podaci.length){
            throw new BadRowIndexException(red, podaci.length - 1);
        }

        if(kolona >= podaci[0].length){
            throw new BadColumnIndexException(red, podaci[0].length - 1);
        }
        
        this.podaci[red][kolona] = vrednost;
    }
}
