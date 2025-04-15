import java.time.LocalDate;
import java.util.ArrayList;

public class Acquisti {
    private Cliente cliente;
    private LocalDate data;
    private ArrayList<PesceTropicale> numeroPesciTropicaliAcquistati;
    private ArrayList<PescePredatore> numeroPesciPredatoriAcquistati;

    public Acquisti(Cliente cliente, LocalDate data) {
        this.cliente = cliente;
        this.data = data;
        this.numeroPesciTropicaliAcquistati = new ArrayList<>();
        this.numeroPesciPredatoriAcquistati = new ArrayList<>();
    }

    // Metodi
    public void visualizzaNumeroTropicaliAcquistati() {
        System.out.println("Pesci tropicali acquistati: " + numeroPesciTropicaliAcquistati.size());
    }

    public void visualizzaNumeroPredatoriAcquistati() {
        System.out.println("Pesci predatori acquistati: " + numeroPesciPredatoriAcquistati.size());
    }

    public boolean verificaRegoleAcquisto() {
        return numeroPesciTropicaliAcquistati.size() <= 5 && numeroPesciPredatoriAcquistati.size() <= 2;
    }

    public void suggerisciAcquario() {
        int tropicali = numeroPesciTropicaliAcquistati.size();
        if (tropicali > 0) {
            System.out.println("Suggerimento: acquario per " + tropicali + " pesci tropicali.");
        }
    }
}