import utility.Giostre;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static utility.Tools.*;
public class Main {
    public static void main(String[] Args) {
       String[] opzioni = {"LUNA PARK", "entrata", "uscita", "visualizza giostra fatta da una persona",
                "visualizza ora e giorno di accesso", "visualizza tempo di permanenza", "visualizza biglietti", "fine"};

        ArrayList<Biglietto> lunaPark = new ArrayList<>();
        Biglietto biglietto = new Biglietto();
        Scanner scanner = new Scanner(System.in);
        boolean fine = true;

        do {
            switch (Menu(opzioni, scanner)) {
                case 1 -> {
                    biglietto = creaBiglietto(scanner);
                    lunaPark.add(biglietto);
                }
                case 2 -> {
                    System.out.println("Inserisci il nome di chi vuole uscire\n");
                    String nome;
                    nome=scanner.nextLine();
                    lunaPark.remove(biglietto.nome.equals(nome));
                }
                case 3 -> {
                    System.out.println("Inserisci il nome di chi vuoi visualizzare le giostre fatte\n");
                    String nome;
                    nome=scanner.nextLine();
                    for(Biglietto x:lunaPark){
                        if(x.nome.equals(nome)){
                            System.out.println("ha fatto la giostra:\n");
                            System.out.println(x.giostreFatte);
                        }
                    }

                }
                case 4->{
                    System.out.println("Inserisci il nome di chi vuoi visualizzare la data e l'ora d'accesso\n");
                    String nome;
                    nome=scanner.nextLine();
                    for(Biglietto x: lunaPark){
                        if (x.nome.equalsIgnoreCase(nome)){
                            System.out.println("\nora d'accesso:\n");
                            System.out.println(x.oraEntrata);
                            System.out.println("\ndata entrata\n");
                            System.out.println(x.dataEntrata);
                        }
                    }
                }
                case 5 -> {
                    //VISUALIZZA TEMPO DI PERMANENZA
                }
                case 6 -> {
                    for (Biglietto x : lunaPark) {
                        System.out.println(x.toString());
                    }
                }
                case 7 -> {
                    fine = false;
                }

            }
        } while (fine);


    }

    private static Biglietto creaBiglietto(Scanner scanner) {
        Biglietto biglietto=new Biglietto();
        System.out.println("Inserisci il nome: \n");
        biglietto.nome = scanner.nextLine();
        System.out.println("Inserisci il cognome: \n");
        biglietto.cognome = scanner.nextLine();
        System.out.println("Inserisci il tipo di giostra fatta\n");
        Giostre[] giostre = Giostre.values();
        String[] menuData = new String[giostre.length + 1];
        menuData[0] = "Tipo di giostra";
        for (int i = 0; i < giostre.length; i++) {
            menuData[i + 1] = giostre[i].toString();
        }
        int giostreIndex;
        do {
            giostreIndex =Menu(menuData, scanner) - 1;
        } while (giostreIndex == -1);
        biglietto.giostreFatte = giostre[giostreIndex];


        while (true) {
            try {
                System.out.println("Inserisci la data di pubblicazione (dd-mm-yyyy): ");
                String dateInput = scanner.nextLine();
                biglietto.dataEntrata = LocalDate.parse(dateInput, biglietto.formattazioneData);

                break;
            } catch (Exception e) {
                System.out.println("\t<ATTENZIONE> Valore data invalido.\n\tInserire una dato con formattazione specificata tra parentesi.");
            }
        }

        while (true) {
            try {
                System.out.print("Inserisci l'ora (formato: HH:mm): ");
                String inputOra = scanner.nextLine();
                biglietto.oraEntrata = LocalTime.parse(inputOra, DateTimeFormatter.ofPattern("HH:mm"));
                break;
            } catch (Exception e) {
                System.out.println("<ATTENZIONE> Formato ora invalido.");
            }
        }

            return biglietto; // Restituisce il biglietto modificato
        }
    }

