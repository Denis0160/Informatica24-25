public class Ordine {
    private Tavolo nTavolo;
    private Cameriere cameriere;
    private int conto;

    public Ordine(Tavolo nTavolo, Cameriere cameriere) {
        this.nTavolo = nTavolo;
        this.cameriere = cameriere;
        this.conto = 0;

    }
    public void aggiungiProdotto(int prodotto) {
        this.conto += prodotto;
    }

    public void setCameriere(Cameriere cameriere) {
        this.cameriere = cameriere;
    }
    public Cameriere getCameriere() {
        return cameriere;
    }
    public void setConto(int conto) {
        this.conto = conto;
    }
    public int getConto() {
        return conto;
    }
    public void setNTavolo(Tavolo nTavolo) {
        this.nTavolo = nTavolo;
    }
    public Tavolo getNTavolo() {
        return nTavolo;
    }


}
