import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Input giocatori
        System.out.println("Nome giocatore 1: ");
        String nome1 = keyboard.nextLine();
        System.out.println("Nome giocatore 2: ");
        String nome2 = keyboard.nextLine();
        System.out.println("Quanti round si desidera effettuare: ");
        int nRound = Integer.parseInt(keyboard.nextLine());

        // Scelta del tipo di partita
        System.out.println("Scegli il tipo di partita (1 - Base, 2 - Avanzata): ");
        int scelta = Integer.parseInt(keyboard.nextLine());

        // Creazione della gara in base alla scelta
        Gara gara;
        if (scelta == 1) {
            gara = new Gara(nome1, nome2, nRound);  // Partita base
        } else if (scelta == 2) {
            gara = new PartitaAvanzata(nome1, nome2, nRound);  // Partita avanzata
        } else {
            System.out.println("Scelta non valida. Si gioca una partita base.");
            gara = new Gara(nome1, nome2, nRound);  // Se l'input non è valido, si gioca una partita base
        }

        // Gioco della partita
        do {
            System.out.println(gara.StatoPartita());
            System.out.println(gara.giocaRound());
        } while (gara.StatoPartita().equals("In corso"));

        // Risultato finale
        System.out.println(gara.Winner());
    }
}
