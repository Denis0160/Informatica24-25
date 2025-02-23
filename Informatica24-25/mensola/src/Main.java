import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import mensola.Libro;
import mensola.Genere;
import static utility.Tools.*;

public class Main {
    private static final int MAX_LIBRI = 20;
    private static Libro[] mensola = new Libro[MAX_LIBRI];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] scelta={"Scegli","inserimento","visualizaa","fine"};
        int i=MAX_LIBRI;
        int j=0;
        boolean fine=true;



        do {
            switch (menu(scelta, scanner)) {
                case 1: {

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
                        i++;
                    }
                    i--;

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
                    mensola[j] = nuovoLibro;
                    j++;
                    break;
                }
                case 2: {
                    // Visualizzare i libri inseriti
                    visualizzaLibri();
                    break;
                }

                default:
                    fine = false;

            }
        }while(fine);









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
}
