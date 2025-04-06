import java.time.LocalDate;

public class AutoCarro extends Auto{
    private double tara;

    public AutoCarro(int id, String marca, String modello, double prezzo, LocalDate annoImmatricolazione, double tara) {
        super(id, marca, modello, prezzo, annoImmatricolazione);
        this.tara = tara;
    }

    public double getTara() {
        return tara;
    }

    @Override
    public String toString() {
        return "AutoCarro{" +
                "tara=" + tara +
                ", id=" + getId() +
                ", marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", annoImmatricolazione=" + getAnnoImmatricolazione() +
                '}';
    }
}
