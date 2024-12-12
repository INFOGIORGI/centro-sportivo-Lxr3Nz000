import java.util.HashMap;

public class Socio {
    private String nome;
    private String cognome;
    private String codiceSocio;
    private HashMap <String, Istruttore> istruttori;

    public Socio(String nome, String cognome, String codiceSocio) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceSocio;
    }

    public String getCodiceSocio() {
        return codiceSocio;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome + " " + cognome + " (" + codiceSocio + ")";
    }
    public int getSize(){
        return istruttori.size();
    }
    public boolean addIstruttore(Istruttore i){
        if(!istruttori.containsValue(i)){
            istruttori.put(i.getCodiceIstruttore(), i);
            return true;
        }
        return false;
    }
}