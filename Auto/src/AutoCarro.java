public class AutoCarro extends Auto {
    private double tara;

    public AutoCarro(AutoCarro clone) {
        super(clone);

        this.tara = clone.tara;
    }

    public AutoCarro(String _id, String _marca, String _modello, double _prezzo, int _anno, double _tara) {
        super(_id, _marca, _modello, _prezzo, _anno);

        this.tara = _tara;
    }

    public String mostraDettagli() {
        return String.format("%s, %s - €%.2f - Anno : %d - tara: %.1f quintali", marca, modello, prezzo, annoImmatricolazione, tara);
    }

    public AutoCarro clone() {
        return new AutoCarro(this);
    }
}
