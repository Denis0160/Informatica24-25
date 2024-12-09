import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import static Tools.Utility.*;

public class  Main {
    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);
        boolean fine = true;
        String[] opzioni={"GESTIONE PUB","aggiungi tavolo","visualizza tavoli",
                "occupa tavolo","aggiungi camerieri all'elenco",
                "","fine"};
        ArrayList<Tavolo> tavoli=new ArrayList<>();

        ArrayList<Cameriere>camerieri=new ArrayList<>();

        do {
            switch (Menu( opzioni, scanner )) {
                case 1: {
                    Tavolo tavolo= creaTavolo( scanner );
                    if(tavolo!=null){
                        tavoli.add( tavolo );
                    }
                    break;
                }
                case 2: {
                    for(Tavolo x:tavoli){
                        System.out.println(x.toString());
                    }
                    break;
                }
                case 3:{
                    occupaTavolo(scanner,tavoli );
                    break;
                }
                /* per aggiungere manualmente i camerieri
                case 4:{
                    Cameriere cameriere = creaCameriere(scanner);

                    boolean esiste = false;
                    for (Cameriere c:camerieri) {
                        if (c.getNome().equalsIgnoreCase(cameriere.getNome())) {
                            esiste=true;
                            break;
                        }
                    }

                    if (esiste){
                        System.out.println("Errore: Un cameriere con lo stesso nome è già presente nella lista.");
                    } else{
                        camerieri.add(cameriere);
                        System.out.println("Cameriere aggiunto con successo.");
                    }
                    break;
                }
                 */
                case 4:{
                    Cameriere giulia= new Cameriere("Giulia",true);
                    camerieri.add(giulia);
                    Cameriere marco= new Cameriere("Marco",true);
                    camerieri.add(marco);
                    Cameriere alex= new Cameriere("Alex",true);
                    camerieri.add(alex);
                    Cameriere Luigi= new Cameriere("Luigi",true);
                    camerieri.add(Luigi);
                    Cameriere andrea= new Cameriere("Andrea",true);
                    camerieri.add(andrea);
                    break;

                }

                default: {
                    fine = false;
                }
            }
        }while (fine);

    }

    /**
     * metodo per la creazione dei tavoli
     */
    private static Tavolo creaTavolo(Scanner scanner) {
        Tavolo tavolo = null;
        try {
            System.out.println("Inserisci il numero di posti del tavolo:\n");
            String nPosti1;
            nPosti1 = scanner.nextLine();
            int nPosti=Integer.parseInt( nPosti1 );
            tavolo = new Tavolo(nPosti, true);
        } catch (Exception e) {
            System.out.println("Errore nella creazione del tavolo: " + e.getMessage());
        }
        return tavolo;
    }

    /**
     * metodo per dare un posto ai clienti
     * @param scanner per l'input dei dati
     * @param tavoli lista dei tavoli
     */
    private static void occupaTavolo(Scanner scanner, ArrayList<Tavolo> tavoli){
        System.out.println("Quante persone sono?\n");
        String persone;
        persone=scanner.nextLine();
        int nPersone=Integer.parseInt( persone );
        boolean trovato=false;
        for(Tavolo i:tavoli){
            if(nPersone<=i.getnposti()){
                System.out.println("Tavolo trovato!\n");
                i.setLibero( false );
                trovato=true;
            }
        }
        if(trovato==false){
            System.out.println("Non c'è un tavolo disponibile per queste persone\n");
        }
    }

    /**
     * metodo per creare un cameriere
     * @param scanner per l'input dei dati
     * @return ritorna un cameriere
     */
    /*
    private static Cameriere creaCameriere(Scanner scanner) {
        Cameriere cameriere=null;
        System.out.println("Inserisci il nome del cameriere:\n");
        String nome;
        nome = scanner.nextLine();
        cameriere.setLibero(true);
        cameriere.setNome(nome);
        return cameriere;
    }
     */

}
