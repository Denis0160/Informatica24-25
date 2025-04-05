public  class Manuale extends Libro {
    String argomento;

    public Manuale(String titolo, String autore, double prezzo, int quantita, String codice, String argomento) {
        super(titolo, autore, prezzo, quantita, codice);
        this.argomento = argomento;
    }
    public String getArgomento() {
        return argomento;
    }
    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }
}
