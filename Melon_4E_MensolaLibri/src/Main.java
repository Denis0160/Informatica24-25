import static frontScreen.FrontEnd.*;
import static utility.Tools.*;

import mensola.*;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MAX_LIBRI = 2;
        final String[] elenco = {
                "Libreria",
                "Inserisci Libro",
                "Visualizza tutti i libri inseriti",
                "Modifica pagine libro",
                "Cancella libro",
                "Visualizza libri di un autore",
                "visualizza dettagli libro",
                "Esci"
        };
        Libro[] scaffale = new Libro[MAX_LIBRI];
        int nLibri = 0;
        boolean fine = true, spazio;

        do {
            switch (Menu(elenco, keyboard)) {
                case 1:

                    try {
                        spazio = controllaSpazio(nLibri, MAX_LIBRI);
                    } catch (Exception e) {
                        System.out.println("Lo scaffale è pieno");
                        break;
                    }

                    Libro momentaneo = LeggiLibro(keyboard, nLibri, scaffale);
                    int doppione = indexOf(momentaneo, scaffale, nLibri);
                    if (doppione != -1) {
                        System.out.println("Il libro è già stato inserito");
                    } else {
                        scaffale[nLibri] = momentaneo;
                    }

                    nLibri++;
                    break;

                case 2:
                    try {
                        visualizza(scaffale, nLibri);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:

                    String titolo;

                    System.out.println("Inserisci il titolo del libro che vuoi visualizzare\n");
                    titolo=keyboard.nextLine();
                    Libro[] titoli=new Libro[5];

                    getIndex(scaffale,titolo,titoli);
                    break;

                default:
                    fine = false;
                    break;
            }
        } while (fine);
    }



    private static int cercaLibro(String titolo, Libro[] scaffale, int nLibri) throws Exception {
        controllaSeVuoto(nLibri);
        for (int i = 0; i < nLibri; i++) {
            if (scaffale[i].titolo.equals(titolo))
                return i;
        }
        throw new Exception("Libro non trovato");
    }

    private static int indexOf(Libro book, Libro[] scaffale, int nLibri) {
        for (int i = 0; i < nLibri; i++) {
            if ((scaffale[i].autore.equals(book.autore)) && (scaffale[i].titolo.equals(book.titolo)))
                return i;
        }
        return -1;
    }

    private static boolean controllaSpazio(int nLibri, int maxLibri) throws Exception {
        if (nLibri < maxLibri)
            return true;
        else
            throw new Exception("Scaffale pieno");
    }

    // Metodo che verifica se esiste già un libro con lo stesso autore e titolo
    private static boolean verificaDuplicato(String autore, String titolo, int nLibri, Libro[] scaffale) throws Exception {
        for (int i = 0; i < nLibri; i++) {
            if (scaffale[i].autore.equals(autore) && scaffale[i].titolo.equals(titolo)) {
                throw new Exception("Trovato Doppione\n");  // Trovato duplicato (autore e titolo già presenti)
            }
        }
        return false;  // Nessun duplicato trovato
    }
    /*private static void getLibro(Libro[] mensola, String titolo){
        boolean c=false;
        for(int i=0;i< mensola.length;i++){
            if(titolo.equals(mensola[i].titolo)){
                System.out.println(mensola[i]);
                c=true;
            }
        }
        if(c){
            System.out.println("Non c'è nessun libro con questo titolo\n");
        }
    }*/

    private static Libro[] getIndex(Libro[] mensola,String titolo,Libro[ ] titoli){
        int j=0;

        for(int i=0;i< mensola.length;i++){
            if(titolo.equals(mensola[i].titolo)){
                titoli[j]=mensola[i];
                j++;
            }
        }
        if(j>0) {
            return titoli;
        }
        else {
            return null;
        }
    }

}
