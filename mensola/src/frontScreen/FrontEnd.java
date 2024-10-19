package frontScreen;

import static utility.Tools.*;

import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import mensola.*;
import java.time.LocalDate;

public class FrontEnd {
    public static Libro leggiLibro(Scanner keyboard) {
        //Istanziamento libro
        Libro output = new Libro();

        //Inserimento autore
        System.out.println("Inserire l'autore: ");
        output.autore = keyboard.nextLine();
        keyboard.nextLine();
        //Inserimento titolo
        System.out.println("Inserire il titolo: ");
        output.titolo = keyboard.nextLine();
        //Inserimento numero di pagine
        System.out.println("Inserire il numero di pagine");
        output.numeroPagine = keyboard.nextInt();
        //Inserimento tipologia
        Genere[] generi = Genere.values();
        String[] menuData = new String[generi.length + 1];
        menuData[0] = "Inserire genere";
        for(int i = 0; i < generi.length; i++)
            menuData[i + 1] = generi[i].toString();
        int genereIndex = (menu(menuData, keyboard) - 1);
        output.tipologia = generi[genereIndex];
        //Inserimento data
        //System.out.print("Inserire data> ");
        //String dataInput = keyboard.nextLine();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //output.dataPubblicazione = LocalDate.parse(dataInput, formatter);

        return output;
    }
    public static void modificaNumeroPagine(Libro libro, Scanner keyboard) {
        System.out.println("Il numero di pagine attuale è: " + libro.getNumeroPagine());
        System.out.print("Inserire il nuovo numero di pagine: ");

        // Gestione dell'input per il numero di pagine
        try {
            int nuovePagine = keyboard.nextInt();
            libro.setNumeroPagine(nuovePagine);  // Modifica il numero di pagine
            System.out.println("Numero di pagine aggiornato a: " + libro.getNumeroPagine());
        } catch (InputMismatchException e) {
            System.out.println("Per favore inserisci un numero valido.");
            keyboard.nextLine(); // Consuma l'input errato
        }
    }
}
