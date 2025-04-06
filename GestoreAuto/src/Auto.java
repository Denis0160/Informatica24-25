import java.time.LocalDate;

public class Auto {
    private int id;
    private String marca;
    private String modello;
    private double prezzo;
    private LocalDate annoImmatricolazione;

    public Auto(int id, String marca, String modello, double prezzo, LocalDate annoImmatricolazione) {
        this.id = id;
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public LocalDate getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }
}
