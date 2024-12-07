import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import static Tools.Utility.*;

public class  Main {
    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);
        boolean fine = true;
        String[] opzioni={"GESTIONE PUB", "aggiungi tavolo","visualizza tavoli","occupa tavolo","fine"};
        ArrayList<Tavolo> tavoli=new ArrayList<>();
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
                    occupaTavolo( scanner,tavoli );
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

    private static void occupaTavolo(Scanner scanner, ArrayList<Tavolo> t){
        System.out.println("Quante persone sono?\n");
        String persone;
        persone=scanner.nextLine();
        int nPersone=Integer.parseInt( persone );
        boolean trovato=false;
        for(Tavolo i:t){
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

}
