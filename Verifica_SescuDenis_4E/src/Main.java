
/*

DOMANDA 1
 Scrivi il metodo compareTo() per le seguenti classi:

Quadrato
TriangoloRettangolo
Circonferenza
Il metodo deve confrontare l'area dell'oggetto attuale con quella di un altro oggetto della stessa classe e restituire:

1 se l'area dell'oggetto attuale è maggiore.
0 se le aree sono uguali.
-1 se l'area dell'oggetto attuale è minore.


DOMANDA 2

Scrivi una classe chiamata Punto con i seguenti attributi e metodi:

Due attributi privati x e y di tipo double, che rappresentano le coordinate del punto.
Un costruttore che accetta come parametri i valori di x e y.
Metodi getter e setter per gli attributi.
Un metodo double distanza(Punto altro) che calcola e restituisce la distanza tra il punto corrente e un altro punto passato come parametro.

DOMANDA 3

Modifica la classe Rettangolo aggiungendo un metodo chiamato calcolaPerimetro() che restituisce il perimetro del rettangolo.
Scrivi il codice per il metodo e spiega il motivo per cui è utile avere metodi di calcolo in una classe.


DOMANDA 4

Scrivi una classe chiamata Poligono con i seguenti requisiti:

Un attributo privato numeroLati (di tipo int) che rappresenta il numero di lati del poligono.
Un attributo privato lunghezzaLato (di tipo double) che rappresenta la lunghezza di ciascun lato.
Un costruttore che accetta numeroLati e lunghezzaLato come parametri.
Un metodo double calcolaPerimetro() che restituisce il perimetro del poligono.
Scrivi anche un metodo toString() che restituisca una descrizione testuale del poligono, ad esempio:
"Poligono con 5 lati di lunghezza 3.0, perimetro: 15.0"


Tutto il codice che scriverete deve essere adeguatamente commentato, specialmente per le parti non banali. In particolare:

Costruttori: spiegate il loro scopo e quali parametri si aspettano.
Metodi di calcolo (ad esempio, calcolaArea o calcolaPerimetro): descrivete brevemente il ragionamento dietro le formule utilizzate.
Metodi complessi (ad esempio, compareTo o distanza): spiegate cosa fanno e perché sono utili.
Evitate commenti superflui per il codice ovvio, come // Imposta la base per un setter, ma concentratevi sul rendere chiaro il funzionamento delle logiche più articolate.
Un codice ben commentato non solo aiuta voi a riprenderlo in futuro, ma permette anche a chi lo legge di comprenderne facilmente il funzionamento!

*/


/* Just another creepy main */

import javax.management.DescriptorRead;

/**
 * perché non ho fatto i controlli nell'inserire i dati in input?
 * in questo caso non ho fatto i controlli perchè i dati vengono inseriti come parametro e sto dando per scontato
 * che i parametri siano giusti.
 * se avessi dato la possibilità all'utente di inserire i dati da tastiera allora avrei avuto la neccessità
 * di controllare i dati in input
 */
public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(15, 18);
        Rettangolo rettangolo1=new Rettangolo(15,18);

        Quadrato quadrato = new Quadrato(6);
        Quadrato quadrato1=new Quadrato(3);


        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        TriangoloRettangolo triangolo1=new TriangoloRettangolo(5,7);

        Circonferenza circonferenza= new Circonferenza(2);
        Circonferenza circonferenza1=new Circonferenza(2);

        System.out.println(rettangolo.getInformazioni());
        System.out.println();
        System.out.println(quadrato.getInformazioni());
        System.out.println(triangolo.getInformazioni());


        /**
         * domanda 1
         */
        //rettangolo
        if (rettangolo.compareTo(rettangolo1) == 0) {
            System.out.println("L'area dei due rettangoli è uguale\n");
        } else if(rettangolo.compareTo(rettangolo1) == 1) {
            System.out.println("L'area del Rettangolo attuale è maggiore dell'altro rettangolo\n");
        }else{
            System.out.println("L'area del rettangolo attuale è minore\n");
        }

        //quadrato
        if (quadrato.compareTo(quadrato1) == 0) {
            System.out.println("L'area dei due quadrati è uguale\n");
        } else if(quadrato.compareTo(quadrato1) == 1) {
            System.out.println("L'area del quadrato attuale è maggiore dell'altro quadrato\n");
        }else{
            System.out.println("L'area del quadrato attuale è minore\n");
        }

        //triangolo
        if (triangolo.compareTo(triangolo1) == 0) {
            System.out.println("L'area dei due triangoli è uguale\n");
        } else if(triangolo.compareTo(triangolo1) == 1) {
            System.out.println("L'area del triangolo attuale è maggiore dell'altro triangolo\n");
        }else{
            System.out.println("L'area del triangolo attuale è minore\n");
        }

        //circonferenza
        if (circonferenza.compareTo(circonferenza1) == 0) {
            System.out.println("L'area delle due circonferenze è uguale\n");
        } else if(circonferenza.compareTo(circonferenza1) == 1) {
            System.out.println("L'area della circonferenza attuale è maggiore dell'area dell'altra circonferenza\n");
        }else{
            System.out.println("L'area della circonferenza attuale è minore\n");
        }

        /**
         * domanda 2
         */
        Punto punto=new Punto(1,1);
        Punto punto1=new Punto(1,2);
        System.out.println("La distanza tra i due punti è "+punto.distanza(punto1));


        /**
         * domanda 3
         */
        System.out.println("Perimetro del rettangolo: "+rettangolo.calcolaPerimetro());


        /**
         * domanda 4
         */
        Poligono poligono=new Poligono( 3,5);
        System.out.println(poligono.toString());

    }
}


/*
Che devi fare?
Correggi il main, se occorre:
Controlla bene il metodo getInformazioni() e vedi come risolvere il problema dello stampare info e fare andare bene il compareTo.
*/