import java.util.Objects;

public class Libro {
    private String titolo;
    private String autore;
    private double prezzo;
    private int quantita;
    private String codice;

    public Libro(String titolo, String autore, double prezzo, int quantita, String codice) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.codice = codice;
        this.quantita = 1;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void incrementaQuantita() {
        this.quantita++;
    }

    public String getCodice() {
        return codice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return autore.equals(libro.autore) && codice.equals(libro.codice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autore, codice);
    }

}
