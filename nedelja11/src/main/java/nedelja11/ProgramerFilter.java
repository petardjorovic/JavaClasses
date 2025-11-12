package nedelja11;

public class ProgramerFilter implements KandidatFilter {

    @Override
    public boolean odgovora(Kandidat kandidat) {
        if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("programiranje") < 12){
            return false;
        }

        if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("baze podataka") < 12){
            return false;
        }

        if(kandidat.getBrojMeseciRadnogIskustvaZaZnanja("engleski") < 24){
            return false;
        }

        return true;
    }

}
