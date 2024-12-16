import java.io.File;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String path = "input.txt";
        CentroSportivo c = new CentroSportivo();
        input(path, c);
    }
    public static void input(String percorso, CentroSportivo c){
        File file = new File(percorso);
        try {
            Scanner tScanner = new Scanner(file);
            while (tScanner.hasNextLine()) {
                String s = tScanner.nextLine();
                String []sp = s.split(";");
                if(sp[0]=="I"){

                    c.aggiungiIstruttore(sp[1], sp[2], sp[3]);
                }
                else if(sp[0]=="S"){

                    c.aggiungiSocio(sp[1], sp[2], sp[3]);
                }
                else if(sp[0]=="AT"){

                    c.aggiungiAttivita(sp[1], sp[2], sp[3],sp[4],sp[5]);
                }
            }
            tScanner.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    

     
}