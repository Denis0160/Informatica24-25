import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import static frontScreen.FrontEnd.*;

import frontScreen.FrontEnd;
import mensola.Libro;
import mensola.Genere;
import static utility.Tools.*;
import java.util.ArrayList;

public class Main {
    private static final int MAX_LIBRI = 20;
    private static Libro[] mensola = new Libro[MAX_LIBRI];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLibri;
        ArrayList<Libro> mensola=new ArrayList<Libro>();
        boolean fine=true;


        String[] scelta={"Scegli","inserisci libro","visualizza mensola","modifica pagine","cancella libro","visualizza libri","fine"};

        do {
            switch (menu(scelta, scanner)) {
                case 1: {
                    Libro libro = FrontEnd.leggiLibro(scanner);
                    mensola.add(libro);
                    break;

                }
                case 2:{
                    System.out.println("ecco la mensola\n");
                    for(Libro i:mensola){
                        System.out.println("\n"+i.toString());
                    }
                    System.out.println("seleziona il numero del libro che vuoi eliminare\n");
                    int n;
                    n=scanner.nextInt();
                    mensola.remove(n);
                    System.out.println("il libro è stato cancellato");
                    break;
                }
                case 3:{
                    modificaNumeroPagine(scanner,mensola);
                    break;
                }

                default: {
                    fine = false;
                    break;
                }
            }
        }while (fine);


        /*// Chiedere all'utente quanti libri vuole inserire
        do {
            System.out.println("Quanti libri vuoi inserire? max 20 \n");
            nLibri = scanner.nextInt();
            scanner.nextLine(); // Consuma newline
        } while (nLibri < 0 || nLibri > MAX_LIBRI);

        // Ciclo per inserire i libri
        for (int i = 0; i < nLibri; i++) {
            Libro nuovoLibro = new Libro();

            // Inserimento del titolo
            System.out.println("Inserisci il titolo del libro: ");
            nuovoLibro.setTitolo(scanner.nextLine());

            // Inserimento dell'autore
            System.out.println("Inserisci l'autore del libro: ");
            nuovoLibro.setAutore(scanner.nextLine());

            // Controllo duplicati
            if (esisteLibro(nuovoLibro)) {
                System.out.println("Errore: esiste già un libro con lo stesso titolo e autore.");
                i--; // Decrementare il contatore per ripetere l'inserimento
                continue;
            }

            // Inserimento del numero di pagine
            System.out.println("Inserisci il numero di pagine: ");
            nuovoLibro.numeroPagine = scanner.nextInt();
            scanner.nextLine(); // Consuma newline

            // Inserimento del genere (in un ciclo finché non viene inserito correttamente)
            boolean genereValido = false;
            while (!genereValido) {
                System.out.println("Scegli il genere del libro: (ROMANZO, FANTASY, SAGGISTICA, THRILLER, STORICO)");
                try {
                    String genereInput = scanner.nextLine().toUpperCase();
                    nuovoLibro.tipologia = Genere.valueOf(genereInput); // Converte l'input a enum
                    genereValido = true; // Esce dal ciclo se il genere è valido
                } catch (IllegalArgumentException e) {
                    System.out.println("Genere non valido. Riprova.");
                }
            }

            // Inserimento della data di pubblicazione (in un ciclo finché non viene inserita correttamente)
            boolean dataValida = false;
            while (!dataValida) {
                System.out.println("Inserisci la data di pubblicazione (dd/MM/yyyy): ");
                String dataInput = scanner.nextLine();
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    nuovoLibro.dataPubblicazione = LocalDate.parse(dataInput, formatter); // Converte la stringa in LocalDate
                    dataValida = true; // Esce dal ciclo se la data è valida
                } catch (DateTimeParseException e) {
                    System.out.println("Formato data non valido. Riprova.");
                }
            }

            // Inserisci il libro nella mensola
            mensola[i] = nuovoLibro;
        }*/

        // Visualizzare i libri inseriti
        //visualizzaLibri();
    }

    // Metodo per controllare se un libro già esiste (stesso titolo e autore)
    private static boolean esisteLibro(Libro libro) {
        for (Libro l : mensola) {
            if (l != null && l.getTitolo().equalsIgnoreCase(libro.getTitolo()) && l.getAutore().equalsIgnoreCase(libro.getAutore())) {
                return true;
            }
        }
        return false;
    }

    // Metodo per visualizzare la lista dei libri
    private static void visualizzaLibri() {
        System.out.println("\nLibri nella mensola:");
        for (Libro libro : mensola) {
            if (libro != null) {
                System.out.println(libro);
            }
        }
    }
    private  static void modificaNumeroPagine(Scanner scanner, ArrayList<Libro> mensola) {
        // Mostra la lista dei libri
        if (mensola.isEmpty()) {
            System.out.println("La mensola è vuota!");
            return;
        }

        System.out.println("Seleziona il libro per modificare il numero di pagine:");
        for (int i = 0; i < mensola.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + mensola.get(i).getTitolo() + " di " + mensola.get(i).getAutore());
        }

        int indiceLibro = -1;
        do {
            System.out.print("Inserisci il numero del libro (1 - " + mensola.size() + "): ");
            if (scanner.hasNextInt()) {
                indiceLibro = scanner.nextInt() - 1;
                if (indiceLibro >= 0 && indiceLibro < mensola.size()) {
                    break;
                }
            }
            System.out.println("Scelta non valida. Riprova.");
            scanner.nextLine();  // Consuma il newline residuo
        } while (true);

        // Chiedi il nuovo numero di pagine
        System.out.print("Inserisci il nuovo numero di pagine: ");
        if (scanner.hasNextInt()) {
            int nuovePagine = scanner.nextInt();
            mensola.get(indiceLibro).setNumeroPagine(nuovePagine);  // Aggiorna il numero di pagine
            System.out.println("Il numero di pagine del libro è stato aggiornato!");
        } else {
            System.out.println("Numero di pagine non valido!");
        }
        scanner.nextLine();  // Consuma il newline residuo
    }
}
