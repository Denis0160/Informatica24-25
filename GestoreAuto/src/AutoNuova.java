import java.time.LocalDate;

public class AutoNuova extends Auto {
    private String alimentazione;
    private int cavalli;

    public AutoNuova(int id, String marca, String modello, double prezzo, LocalDate annoImmatricolazione, String alimentazione, int cavalli) {
        super(id, marca, modello, prezzo, annoImmatricolazione);
        this.alimentazione = alimentazione;
        this.cavalli = cavalli;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public int getCavalli() {
        return cavalli;
    }

    @Override
    public String toString() {
        return "AutoNuova{" +
                "alimentazione='" + alimentazione + '\'' +
                ", cavalli=" + cavalli +
                ", id=" + getId() +
                ", marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", annoImmatricolazione=" + getAnnoImmatricolazione() +
                '}';
    }
}
