import java.util.*;

public class Main {
    public static void main(String[] args) {

                ArrayList<String> parole=new ArrayList<String>();
                parole.add("ciao");//Adding object in arraylist
                parole.add("pippo");
                parole.add("scuola");
                parole.add("cane");

                //stampo gli elementi
                for(String i:parole){
                    System.out.println(i);
                }
                //ottengo la dimensione
                int dim = parole.size();
                System.out.println("dimensione \n" + dim);

                //rimuovo una parola all'indice 0
                parole.remove(0);
                System.out.println("stampa array senza l'indice 0\n");
                for(String i:parole){
                    System.out.println(i);
                }

                //rimuovo lo specifico elemento
                parole.remove("scuola");
                System.out.println("stampa array senza parola scuola\n");
                for(String i:parole){
                 System.out.println(i);
                 }

                //aggiungo un elemento all'arraylist
                System.out.println("Aggiungo all'array l'elemento mondo\n");
                parole.add("mondo");
                for(String i:parole){
                    System.out.println(i);
                }


            }

        }

