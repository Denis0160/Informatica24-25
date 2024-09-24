/*
java: LINGUAGGIO DI PROGRAMAZIONE AD OGGETTI ATTRAVERSO L'USO DELLE CLASSI
- INTELLIJ: AMBIENTE DI SVILUPPO, FRAMWORK PER CREAZIONE DI APPLICAZIONI
- JDK: LIBRERIE NECCESSARIE PER IL FUNZIONAMENTO DI JAVA
- UNA VOLTA SCRITTO IL FILE SORGENTE SI COMPILA E SI GENERA IL BYTECODE
- JAVA SI PUO ESEGUIRE SU QUALSIASI PIATTAFORMA, MULTIPIATTAFORMA
- LA JVM INTERPRETA IL BYTE CODE
 */
import static utility.Tools.*;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String [] opzioni={"Scelta" ,
                "inserimento",
                "visualizzazione" ,
                "fine"};
        boolean fine=true;

        final int nMax=10;
        final int RANGE=100;


        Scanner scanner=new Scanner(System.in);
        Random casuale=new Random();
        int [] numeri=new int[nMax];
        do{
            switch(Menu(opzioni,scanner)){
                case 1:
                    generaNumeri(numeri,casuale,RANGE);

                    break;

                case 2:
                    for(int i=0;i<numeri.length;i++){
                        System.out.println(numeri[i]);
                    }
                    break;

                default:
                    fine=false;
                    break;
            }

        }while(fine);

    }
    private static void generaNumeri(int[]numeri, Random casuale, int range){
        for(int i=0;i< numeri.length;i++){
            numeri[i]=casuale.nextInt(range);
        }

    }

}
