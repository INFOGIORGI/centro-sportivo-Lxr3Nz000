import java.util.HashMap;

public class CentroSportivo {
   
    private HashMap <String, Socio> soci;
    private HashMap <String, Istruttore> istruttori;
    

    public CentroSportivo(){
        soci= new HashMap<>();
       istruttori = new HashMap<>();
    }
    public boolean aggiungiSocio(String nome, String cognome, String codiceSocio) {
        if (soci.containsKey(codiceSocio)) {
            return false; 
        }
        soci.put(codiceSocio, new Socio(nome, cognome, codiceSocio));
        return true;
    }

    public boolean rimuoviSocio(String codiceSocio) {
        if (soci.containsKey(codiceSocio)) {
            soci.remove(codiceSocio);
            return true;
        }
        
        return false; 
        
    }
    public Socio getSocio(String codiceSocio) {
        return soci.get(codiceSocio);
    }

    public boolean aggiungiIstruttore(String nome, String cognome, String codiceIstruttore) {
        if (istruttori.containsKey(codiceIstruttore)) {
            return false; 
        }
        istruttori.put(codiceIstruttore, new Istruttore(nome, cognome, codiceIstruttore));
        return true;
    }
    public boolean rimuoviIstruttore(String codiceIstruttore) {
        if (istruttori.containsKey(codiceIstruttore)) {
            istruttori.remove(codiceIstruttore);
            return true;
        }
        
        return false; 
        
    }
    public Istruttore getIstruttore(String codiceIstruttore) {
        return istruttori.get(codiceIstruttore);
    }
    
    public boolean assegna(String codSocio,String codIstruttore){

        if(istruttori.containsKey(codIstruttore)&&soci.containsKey(codSocio)){
            Socio s = soci.get(codSocio);
            Istruttore i = istruttori.get(codIstruttore);
            if(i.addSocio(s)==true && s.addIstruttore(i)==true){
                i.addSocio(s);
                s.addIstruttore(i);
                return true;
            }
        }
        return false;
    }
    public boolean removeAssegnazione(String codSocio,String codIstruttore){
        if(istruttori.containsKey(codIstruttore)&&soci.containsKey(codSocio)){
            if(istruttori.get(codIstruttore).removeSocio(codSocio)==true){
                istruttori.get(codIstruttore).removeSocio(codSocio);
                return true;
            }
        }
        return false;
    }

    

    
    

}