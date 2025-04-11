public class AutoNuova extends Auto {
    private String alimentazione;
    private double cavalli;

    public AutoNuova(AutoNuova clone) {
        super(clone);

        this.alimentazione = clone.alimentazione;
        this.cavalli = clone.cavalli;
    }

    public AutoNuova(String _id, String _marca, String _modello, double _prezzo, int _anno, String _alimentazione, double _cavalli) {
        super(_id, _marca, _modello, _prezzo, _anno);

        this.alimentazione = _alimentazione;
        this.cavalli = _cavalli;
    }

    public String mostraDettagli() {
        return String.format("%s, %s - €%.2f - Anno : %d - Alimentazione: %s - %.1fCV", marca, modello, prezzo, annoImmatricolazione, alimentazione, cavalli);
    }

    public Auto clone() {
        return new AutoNuova(this);
    }
}
