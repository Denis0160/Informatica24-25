public class Smartphone extends ProdottoElettronico {
    private String modello;
    private int memoria;

    public Smartphone(String codiceProdotto, String marca, double prezzo, String modello, int memoria) {
        super(codiceProdotto, marca, prezzo);
        this.modello = modello;
        this.memoria = memoria;
    }

    public String getModello() {
        return modello;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modello: " + modello + ", Memoria: " + memoria + "GB";
    }
}