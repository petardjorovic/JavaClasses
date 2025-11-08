package enumtypes;

public enum VrstaGoriva {
    BENZIN, DIZEL, GAS, ELEKTRICNA_ENERGIJA;

    @Override
    public String toString(){
        String gorivo = null;
        switch (this) {
            case BENZIN:
                gorivo = "benzin";
                break;
            case DIZEL:
                gorivo = "dizel";
                break;
            case GAS:
                gorivo = "gas";
                break;
            case ELEKTRICNA_ENERGIJA:
                gorivo = "elektricna_energija";
                break;
        }
        return gorivo;
    }

    public static VrstaGoriva fromSkracenica(String skracenica){
        VrstaGoriva gorivo = null;
        switch (skracenica.toUpperCase().trim()) {
            case "B":
                gorivo = BENZIN;
                break;
            case "D":
                gorivo = DIZEL;
                break;
            case "G":
                gorivo = GAS;
                break;
            case "E":
                gorivo = ELEKTRICNA_ENERGIJA;
                break;
        }
        return gorivo;
    }
}
