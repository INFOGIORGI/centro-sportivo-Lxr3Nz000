import java.util.ArrayList;
import java.util.HashMap;

class Attivita {
    private String codiceSocio;
    private String codiceIstruttore;
    private double data;
    private double orarioInizio; 
    private double orarioFine; 
    private String descrizione;

    public Attivita(String codiceSocio, String codiceIstruttore, double data, double orarioInizio, double orarioFine, String descrizione) {
        this.codiceSocio = codiceSocio;
        this.codiceIstruttore = codiceIstruttore;
        this.data = data;
        this.orarioInizio = orarioInizio;
        this.orarioFine = orarioFine;
        this.descrizione = descrizione;
    }
    public boolean controlloOra(String ora1,String ora2){
        String newdataI = ora1.replace(";", "");
        String newdataf = ora2.replace(";", "");
        if(ora1.compareTo(newdataI)<0 && ora2.compareTo(newdataf)>0){
            return true;
        }
        return false;
    }
    
}