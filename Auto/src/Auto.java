import java.util.Random;

public abstract class Auto implements Cloneable {
    protected String id;
    protected String marca;
    protected String modello;
    protected double prezzo;
    protected int annoImmatricolazione;

    public Auto(Auto clone) {
        this.id = clone.id;
        this.marca = clone.marca;
        this.modello = clone.modello;
        this.prezzo = clone.prezzo;
        this.annoImmatricolazione = clone.annoImmatricolazione;
    }

    public Auto(String _id, String _marca, String _modello, double _prezzo, int _anno) {
        this.id = _id;
        this.marca = _marca;
        this.modello = _modello;
        this.prezzo = _prezzo;
        this.annoImmatricolazione = _anno;
    }

    public void setPrezzo(double _prezzo) {
        this.prezzo = _prezzo;
    }

    public double calcolaValoreAttuale() {
        return 0;
    }

    public abstract String mostraDettagli();

    public abstract Auto clone();

    public String getMarca() {
        return this.marca;
    }

    @Override
    public boolean equals(Object check) {
        if(check instanceof Auto) {
            return ((Auto)check).id.equals(this.id);
        } else return super.equals(check);
    }
}
