import java.util.Objects;

public abstract class ProdottoElettronico {
    private String codice;
    protected String marca;
    protected double prezzo;

    public ProdottoElettronico(String codice, String marca, double prezzo) {
        this.codice = codice;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public abstract int costoMemoria();

    @Override
    public String toString() {
        return String.format("prodotto: " + codice + " marca: " + marca + " prezzo: " + prezzo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProdottoElettronico)) {
            return false;
        }
        ProdottoElettronico that = (ProdottoElettronico) obj;
        return Objects.equals(this.codice, that.codice);
    }

}