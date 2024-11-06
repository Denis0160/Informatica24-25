import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;


import frontScreen.FrontEnd;
import mensola.*;
import static frontScreen.FrontEnd.*;
import static Tools.utility.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Libro> mensola = new ArrayList<>();
        final int MAX = 3;
        Libro[] libri = new Libro[MAX];
        int nLibri = 0;
        boolean fine = true;
        Libro libroInput;
        String[] opzioni = {"MENSOLA", "Inserimento", "visualizza", "inserimento2","rimozione elmento oggetto","rimozione elemento indice", "modifica pagine libro","visita mensola","crea mensola", "fine"};

        do {
            switch (menu(opzioni, keyboard)) {
                case 1: {
                    Libro libro = leggiLibro(keyboard);
                    try {


                        int k = indexList(mensola, libro);
                        System.out.println("Il libro si trova nella posizione:\n" + k);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        mensola.add(libro);
                    }
                    break;
                }
                case 2:{
                    mensola.forEach(x -> System.out.println(x.toString()));
                    break;
                }
                case 3:{
                    try {
                        if (mensola.size() < MAX) {
                            Libro libro = leggiLibro(keyboard);

                            if(mensola.indexOf(libro)==-1){
                                mensola.add(libro);
                            }
                            else
                                throw new Exception("Libro presente");

                        }else
                            throw new Exception("Mensola Piena");
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }



                    break;
                }
                case 4:
                    Libro libro = leggiLibro(keyboard, true);
                    try{
                        if(!mensola.contains(libro))
                            throw new Exception("Libro non trovato");

                        mensola.remove(libro);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    libroInput = leggiLibro(keyboard, true);
                    try{
                        if(!mensola.contains(libroInput))
                            throw new Exception("Libro non trovato");

                        mensola.remove(mensola.indexOf(libroInput));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try{
                        modificaPagina(mensola, keyboard);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    visitaLibro(mensola,keyboard);
                    break;
                case 8:
                    assegnaLibriAutomaticamente(mensola);
                    break;

                default:
                    fine = false;
            }

        } while (fine);
    }

    private static int indexList(ArrayList<Libro> mensola, Libro libro) throws Exception {
        for (int i = 0; i < mensola.size(); i++) {
            if (mensola.get(i).autore.equals(libro.autore) && mensola.get(i).titolo.equals(libro.titolo)) {
                return i;


            }
        }
        throw new Exception("Libro non esistente");

    }

    private static void modificaPagina(ArrayList<Libro> mensola, Scanner keyboard)throws Exception{
        Libro libroInput = leggiLibro(keyboard, true);
        if(!mensola.contains(libroInput))
            throw new Exception("Libro non trovato");

        /* inserimento nuova pagina */
        int numPagine=0;
        boolean check;

        do{
            check = false;
            try {
                System.out.println("Inserisci il numero delle pagine");
                numPagine = Integer.parseInt(keyboard.nextLine());
                if(numPagine<=0)
                    throw new Exception("Valore negativo inserito non valido");
            }catch(NumberFormatException e){
                System.out.println("Formato del valore inserito non valido");
                check = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                check = true;
            }
        }while(check);

        mensola.get(mensola.indexOf(libroInput)).numeroPagine = numPagine;
    }

    public static void assegnaLibriAutomaticamente(ArrayList<Libro> mensola){
        String[] listaNomi = {"Dante", "Catullo", "Leopardi", "Boccaccio", "Petrarca"};
        String[] listaTitoli = {"Divina Commedia", "Ciao", "Canti", "Decameron", "Canzoniere"};

        for(int i=0;i<5;i++) {
            Libro libroInserito = new Libro();
            libroInserito.numeroPagine = 5;
            libroInserito.dataPubblicazione = LocalDate.of(2024,12,11);
            libroInserito.tipologia = Genere.MANUALE;
            libroInserito.prezzoLibro = 15;
            libroInserito.titolo = listaTitoli[i];
            libroInserito.autore = listaNomi[i];
            mensola.add(libroInserito);
        }
    }

    public static void visitaLibro(ArrayList<Libro> mensola, Scanner keyboard){
        String[] opzioni={"VISITA LIBRO", "Posizione Iniziale", "Precedente", "Successivo"};
        int scelta, posizioneIniziale=0;
        boolean fine=true;
        do{
            scelta = menu(opzioni, keyboard);


                switch(scelta){
                    case 1 -> {
                        try {
                            System.out.println("Inserisci la posizione iniziale\n");
                            posizioneIniziale = keyboard.nextInt();
                            if(posizioneIniziale >= mensola.size() || posizioneIniziale < 0)
                                throw new Exception("posizione non valida");
                            System.out.println("La posizione corrente contiene : ");
                            System.out.println(mensola.get(posizioneIniziale));
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }




                    }
                    case 2 -> {
                        try {
                            if (posizioneIniziale < 0) {
                                throw new Exception("prima posizione dell'array, non ci sono posizioni precedenti");

                            }
                            int k=posizioneIniziale-1;
                            posizioneIniziale=k;
                            System.out.println(mensola.get(k));

                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                    }
                    case 3 ->{
                        try {
                            if (posizioneIniziale >= mensola.size()) {
                                throw new Exception("ultima posizione dell'array, non ci sono posizioni successive");

                            }
                            int j=posizioneIniziale+1;
                            posizioneIniziale=j;
                            System.out.println(mensola.get(j));

                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                    }
                    default -> fine=false;

                }


        }while(fine);
    }
}