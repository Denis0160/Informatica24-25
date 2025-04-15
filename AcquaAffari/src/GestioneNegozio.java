import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestioneNegozio {
    private ArrayList<Cliente> clienti;
    private ArrayList<Acquario> acquari;

    public GestioneNegozio() {
        this.clienti = new ArrayList<>();
        this.acquari = new ArrayList<>();
    }

    public void avviaMenu() {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n--- Menu Gestione Negozio ---");
            System.out.println("1. Aggiungi Cliente");
            System.out.println("2. Aggiungi Acquario");
            System.out.println("3. Aggiungi Pesce a un Acquario");
            System.out.println("4. Visualizza Clienti");
            System.out.println("5. Visualizza Acquari");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova linea

            switch (scelta) {
                case 1:
                    aggiungiCliente(scanner);
                    break;
                case 2:
                    aggiungiAcquario(scanner);
                    break;
                case 3:
                    aggiungiPesce(scanner);
                    break;
                case 4:
                    visualizzaClienti();
                    break;
                case 5:
                    visualizzaAcquari();
                    break;
                case 6:
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 6);

        scanner.close();
    }

    private void aggiungiCliente(Scanner scanner) {
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci codice cliente: ");
        String codiceCliente = scanner.nextLine();
        System.out.print("Inserisci email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cognome, codiceCliente, email);
        clienti.add(cliente);
        System.out.println("Cliente aggiunto con successo!");
    }

    private void aggiungiAcquario(Scanner scanner) {
        System.out.print("Inserisci codice identificativo: ");
        String codice = scanner.nextLine();
        System.out.print("Inserisci volume (in litri): ");
        double volume = scanner.nextDouble();
        System.out.print("L'acqua è dolce? (true/false): ");
        boolean dolce = scanner.nextBoolean();

        Acquario acquario = new Acquario(codice, volume, dolce);
        acquari.add(acquario);
        System.out.println("Acquario aggiunto con successo!");
    }

    private void aggiungiPesce(Scanner scanner) {
        if (acquari.isEmpty()) {
            System.out.println("Nessun acquario disponibile. Aggiungi un acquario prima di aggiungere pesci.");
            return;
        }

        System.out.println("Seleziona un acquario:");
        for (int i = 0; i < acquari.size(); i++) {
            System.out.println((i + 1) + ". " + acquari.get(i).getCodiceIdentificativo());
        }
        System.out.print("Scegli un acquario: ");
        int sceltaAcquario = scanner.nextInt() - 1;
        scanner.nextLine(); // Consuma la nuova linea

        if (sceltaAcquario < 0 || sceltaAcquario >= acquari.size()) {
            System.out.println("Scelta non valida.");
            return;
        }

        Acquario acquario = acquari.get(sceltaAcquario);

        System.out.print("Inserisci specie del pesce: ");
        String specie = scanner.nextLine();
        System.out.print("Il pesce è aggressivo? (true/false): ");
        boolean aggressivo = scanner.nextBoolean();
        System.out.print("Il pesce vive in acqua dolce? (true/false): ");
        boolean dolce = scanner.nextBoolean();
        System.out.print("Inserisci dimensioni del pesce (in cm): ");
        double dimensioni = scanner.nextDouble();
        System.out.print("Inserisci prezzo del pesce: ");
        double prezzo = scanner.nextDouble();

        Animale pesce;
        if (aggressivo) {
            pesce = new PescePredatore();
        } else {
            pesce = new PesceTropicale();
        }

        pesce.setSpecie(specie);
        pesce.setAggressivo(aggressivo);
        pesce.setDolce(dolce);
        pesce.setDimensioni(dimensioni);
        pesce.setPrezzo(prezzo);

        acquario.aggiungiAnimale(pesce);
        System.out.println("Pesce aggiunto con successo all'acquario!");
    }

    private void visualizzaClienti() {
        if (clienti.isEmpty()) {
            System.out.println("Nessun cliente registrato.");
            return;
        }

        System.out.println("\n--- Elenco Clienti ---");
        for (Cliente cliente : clienti) {
            System.out.println("Nome: " + cliente.getNome() + ", Cognome: " + cliente.getCognome() +
                    ", Codice Cliente: " + cliente.getCodiceCliente() + ", Email: " + cliente.getEmail());
        }
    }

    private void visualizzaAcquari() {
        if (acquari.isEmpty()) {
            System.out.println("Nessun acquario registrato.");
            return;
        }

        System.out.println("\n--- Elenco Acquari ---");
        for (Acquario acquario : acquari) {
            System.out.println("Codice: " + acquario.getCodiceIdentificativo() + ", Volume: " + acquario.getVolume() +
                    "L, Dolce: " + acquario.isDolce() + ", Numero di animali: " + acquario.getAnimaliPresenti().size());
        }
    }
}