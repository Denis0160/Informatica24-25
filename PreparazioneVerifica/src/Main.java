import java.util.Scanner;

/* Versione light */
/*
Modifica il programma principale (main) in modo che:
1.	Chieda all'utente di inserire i dati da tastiera per creare un nuovo rettangolo, un quadrato e una circonferenza.
2.	Stampi i dati e le aree delle figure create.
Esempio di input richiesto:
•	Per il rettangolo: base e altezza.
•	Per il quadrato: lunghezza del lato.
•	Per la circonferenza: lunghezza del raggio.
Assicurati che il programma verifichi se i valori inseriti dall'utente siano positivi, e in caso contrario stampi un messaggio di errore.
*/

public class Main {
    public static void main(String[] args) {

        // Creazione di un rettangolo e calcolo area
        boolean verificaRettangolo = false;
        Scanner scanner = new Scanner(System.in);
        while(!verificaRettangolo) {
            try {
                Rettangolo rettangolo = createRettangolo(scanner);
                verificaRettangolo = true;
                System.out.println("Rettangolo - Base: " + rettangolo.getBase() + ", Altezza: " + rettangolo.getAltezza());
                System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Creazione di un quadrato e calcolo area
        try{
            Quadrato quadrato = createQuadrato(scanner);
            System.out.println("\nQuadrato - Lato: " + quadrato.getLato());
            System.out.println("Area del quadrato: " + quadrato.calcolaArea());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Creazione di un triangolo rettangolo e calcolo area
        try{
            TriangoloRettangolo triangolo = createTriangolo(scanner);
            System.out.println("\nTriangolo Rettangolo - Base: " + triangolo.getBase() + ", Altezza: " + triangolo.getAltezza());
            System.out.println("Area del triangolo rettangolo: " + triangolo.calcolaArea());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Creazione di una circonferenza e calcolo area
        try{
            Circonferenza circonferenza = createCirconferenza(scanner);
            System.out.println("\nCirconferenza - Raggio: " + circonferenza.getRaggio());
            System.out.println("Area della circonferenza: " + circonferenza.calcolaArea());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static Rettangolo createRettangolo(Scanner scanner)throws Exception {
        System.out.println("Inserisci la base del rettangolo\n");
        int base = scanner.nextInt();
        if(base < 0) {
            throw new Exception("Base del rettangolo invalido");
        }
        System.out.println("Inserisci la altezza del rettangolo\n");
        int altezza = scanner.nextInt();
        if(altezza < 0) {
            throw new Exception("Altezza del rettangolo invalido");
        }
        return new Rettangolo(base, altezza);
    }

    private static Quadrato createQuadrato(Scanner scanner)throws Exception {
        System.out.println("Inserisci la base del quadrato\n");
        int lato = scanner.nextInt();
        if(lato < 0) {
            throw new Exception("lato del quadrato invalido");

        }
        return new Quadrato(lato);
    }

    private static TriangoloRettangolo createTriangolo(Scanner scanner) throws Exception {
        System.out.println("Inserisci la base del rettangolo\n");
        int base = scanner.nextInt();
        if(base < 0) {
            throw new Exception("Base del rettangolo invalido");

        }
        System.out.println("Inserisci la altezza del rettangolo\n");
        int altezza = scanner.nextInt();
        if(altezza < 0) {
            throw new Exception("Altezza del rettangolo invalido");
        }
        return new TriangoloRettangolo(base, altezza);
    }

    private static Circonferenza createCirconferenza(Scanner scanner) throws Exception {
        System.out.println("Inserisci il raggio della circonferenza\n");
        int raggio = scanner.nextInt();
        if(raggio < 0) {
            throw new Exception("raggio della circonferenza invalido");
        }
        return new Circonferenza(raggio);
    }
}



/*
MAIN ALTERNATIVO:
*/
/*
Modifica le classi Rettangolo, Quadrato, TriangoloRettangolo e Circonferenza per fare in modo che il programma compili correttamente ed esegua quanto segue:
1.	Aggiungi un metodo String descrizione() in ciascuna classe che restituisca una stringa con i dettagli della figura.
o	Esempio per un rettangolo: "Rettangolo con base 5.0 e altezza 8.0".
o	Esempio per un quadrato: "Quadrato con lato 6.0".
o	Fai in modo che il metodo restituisca descrizioni simili per le altre figure.
2.	Verifica che il metodo calcolaArea() sia presente in tutte le classi e che restituisca correttamente l'area.
Nota: Non modificare il codice del main. Adatta le classi al codice esistente.

*/
/*
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 8);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        Circonferenza circonferenza = new Circonferenza(7);

        // Stampa delle descrizioni delle figure
        System.out.println(rettangolo.descrizione());
        System.out.println(quadrato.descrizione());
        System.out.println(triangolo.descrizione());
        System.out.println(circonferenza.descrizione());

        // Stampa delle aree delle figure
        System.out.println("\nAree delle figure:");
        System.out.println("Rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Quadrato: " + quadrato.calcolaArea());
        System.out.println("Triangolo Rettangolo: " + triangolo.calcolaArea());
        System.out.println("Circonferenza: " + circonferenza.calcolaArea());
    }
}

 */






/* Just another creepy main */
/*
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 8);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        System.out.println(rettangolo.getInformazioni());
        System.out.println(quadrato.getInformazioni());
        System.out.println(triangolo.getInformazioni());

        if (rettangolo.compareTo(quadrato) > 0) {
            System.out.println("Il rettangolo ha un'area maggiore del quadrato.");
        } else {
            System.out.println("Il quadrato ha un'area maggiore o uguale a quella del rettangolo.");
        }
    }
}


 */



/*
Che devi fare?
Correggi il main, se occorre:
Controlla bene il  metodo getInformazioni() e vedi come risolvere il problema dello stampare info.

Modifica alle classi:
Aggiungi un metodo getInformazioni() in ciascuna classe (Rettangolo, Quadrato, TriangoloRettangolo), che restituisca una descrizione dettagliata della figura
(simile a un metodo descrizione() ma con più dettagli, ad esempio il calcolo dell'area incluso nella stringa).
Sistema il metodo compareTo:

Fai in modo che tutte le figure abbiano un metodo compareTo(Figura altra) che consenta di confrontare le aree di due figure geometriche di tipo diverso.
Nota: Il confronto deve funzionare anche tra figure geometriche diverse, ad esempio tra un rettangolo e un quadrato.
Spiega brevemente il ragionamento dietro le modifiche apportate prima di realizzare le modifiche.

*/