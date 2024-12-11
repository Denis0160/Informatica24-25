public class Poligono {

    private int numeroLati;
    private double lunghezzaLato;

    /**
     * costruttore dell'oggetto poligono, ci permette di implementare nel main
     * più oggetti di tipo poligono dando a ogniuno carateristiche diverse o uguali o simili.
     * Si passano i parametri perche sono quelle che caratterizzano l'oggetto
     * @param numeroLati numero lati del poligono
     * @param lunghezzaLato lunghezza di ciascun lato
     */
    public Poligono(int numeroLati,double lunghezzaLato){
        this.numeroLati=numeroLati;
        this.lunghezzaLato=lunghezzaLato;
    }

    public int getNumeroLati(){
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati){
        this.numeroLati=numeroLati;
    }

    public double getLunghezzaLato(){
        return lunghezzaLato;
    }

    public void setLunghezzaLato(double lunghezzaLato){
        this.lunghezzaLato=lunghezzaLato;
    }

    /**
     * metodo per calcolare il perimetro
     * il perimetro lo calcolo facendo la moltiplicazione del numero dei lati per la lunghezza che è uguale per tutti i lati
     * se la lunghezza dei lati fosse diversa tra di loro bisognerebbe fare una somma tra tutte le lunghezze di tutti i lati, ma visto che i lati hanno tutti lunghezza
     * uguale basta fare la moltiplicazione tra il numero dei lati e la lunghezza,
     * @return il perimetro
     */
    public double calcolaPerimetro(){
        return numeroLati*lunghezzaLato;
    }

    /**
     * Questo metodo stampa le informazioni riferite al poligono, quindi il numero di lati
     * la lunghezza di un lato e il perimetro
     * @return una stringa formattata delle informazioni di un poligono
     */
    @Override
    public String toString(){
        return String.format("Poligono con %d lati di lunghezza %.2f, perimetro %.2f",this.numeroLati,this.lunghezzaLato,this.calcolaPerimetro());
    }



}
