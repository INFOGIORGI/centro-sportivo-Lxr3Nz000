import java.util.HashMap;

public class Istruttore {
    private String nome;
    private String cognome;
    private String codiceIstruttore;
    private HashMap <String, Socio> soci;


    public Istruttore(String nome, String cognome, String codiceIstruttore) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceIstruttore = codiceIstruttore;
    }
    public String getCodiceIstruttore() {
        return codiceIstruttore;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome + " " + cognome + " (" + codiceIstruttore + ")";
    }
    public boolean removeSocio(String codice){
        if(soci.containsKey(codice)==true && soci.get(codice).getSize()==0){
            soci.remove(codice);
            return true;
        }
        return false;
    }

    public int getSize(){
        return soci.size();
    }
    public boolean addSocio(Socio s){
        if(!soci.containsValue(s)){
            soci.put(s.getCodiceSocio(), s);
            return true;
        }
        return false;

    }
}