import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        /**
         * Definire la classe Auto che è composta dagli attributi:
         * id
         * marca
         * modello
         * prezzo
         * anno di immatricolazione
         * Definire la classe AutoNuova che deriva da Auto contenente i seguenti attributi:
         * alimentazione
         * cavalli
         * Definire la classe AutoCarro che deriva da Auto che contenente i seguenti attributi:
         * tara (in quintali)
         * Definire la classe Concessionario che implementa le operazioni CRUD. Occorre aggiungere:
         * ricerca() per marca
         * visualizzare gli autoveicoli disponibili a partire dall'anno di immatricolazione
         * Occorre definire due metodi:
         * calcolaValoreAttuale() calcola il valore attuale dell'auto a partire dal 2025 considerando che per ogni anno dalla data di immatricolazione l'auto si svaluta del 5%
         * mostraDettagli() visualizza i dettagli e le caratteristiche di ogni autoVeicolo - astratto
         */

        // Creazione di un concessionario
        Concessionario concessionario = new Concessionario();
        // Aggiunta di auto nuove
        concessionario.aggiungiAuto(new AutoNuova(1, "Fiat", "Panda", 15000, LocalDate.of(2022, 1, 1), "Benzina", 70));
        concessionario.aggiungiAuto(new AutoNuova(2, "Ford", "Fiesta", 18000, LocalDate.of(2023, 1, 1), "Diesel", 90));
        // Aggiunta di auto carro
        concessionario.aggiungiAuto(new AutoCarro(3, "Mercedes", "Sprinter", 30000, LocalDate.of(2021, 1, 1), 2.5));

        // Ricerca di un'auto per marca
        Auto autoTrovata = concessionario.cercaAutoPerMarca("Fiat");
        if (autoTrovata != null) {
            System.out.println("Auto trovata: " + autoTrovata);
        } else {
            System.out.println("Auto non trovata.");
        }
        // Visualizzazione delle auto immatricolate dal 2022
        List<Auto> autoRecenti = concessionario.visualizzaAutoPerAnno(2022);
        System.out.println("Auto immatricolate dal 2022:");
        for (Auto auto : autoRecenti) {
            System.out.println(auto);
        }
        // Calcolo del valore attuale di un'auto
        double valoreAttuale = concessionario.calcolaValoreAttuale(autoTrovata);
        System.out.println("Valore attuale dell'auto trovata: " + valoreAttuale);
        // Mostra dettagli dell'auto trovata
        concessionario.mostraDettagli(autoTrovata);
        // Rimozione di un'auto
        concessionario.rimuoviAuto(1);
        System.out.println("Auto dopo rimozione:");
        for (Auto auto : concessionario.visualizzaAutoPerAnno(2020)) {
            System.out.println(auto);
        }
        // Aggiunta di un'auto nuova
        concessionario.aggiungiAuto(new AutoNuova(4, "Toyota", "Yaris", 20000, LocalDate.of(2024, 1, 1), "Ibrida", 100));
        // Visualizzazione di tutte le auto
        System.out.println("Tutte le auto disponibili:");
        for (Auto auto : concessionario.visualizzaAutoPerAnno(2000)) {
            System.out.println(auto);
        }
        // Calcolo del valore attuale di un'auto
        Auto autoDaCalcolare = new AutoNuova(5, "Audi", "A3", 25000, LocalDate.of(2020, 1, 1), "Benzina", 150);
        double valoreAttualeCalcolato = concessionario.calcolaValoreAttuale(autoDaCalcolare);
        System.out.println("Valore attuale dell'auto da calcolare: " + valoreAttualeCalcolato);
        // Mostra dettagli dell'auto da calcolare
        concessionario.mostraDettagli(autoDaCalcolare);
        // Rimozione di un'auto
        concessionario.rimuoviAuto(5);
        System.out.println("Auto dopo rimozione:");
        for (Auto auto : concessionario.visualizzaAutoPerAnno(2000)) {
            System.out.println(auto);
        }
        // Aggiunta di un'auto nuova
        concessionario.aggiungiAuto(new AutoNuova(6, "BMW", "Serie 3", 35000, LocalDate.of(2025, 1, 1), "Diesel", 190));
        // Visualizzazione di tutte le auto
        System.out.println("Tutte le auto disponibili:");
        for (Auto auto : concessionario.visualizzaAutoPerAnno(2000)) {
            System.out.println(auto);
        }
    }
}