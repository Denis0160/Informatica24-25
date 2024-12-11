public class Quadrato {
    private double lato;

    /**
     * costruttore del Quadrato che permette di istanziare l'oggetto nel main
     * @param lato dimensione del lato del quadrato
     */
    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato * lato;
    }

    /**
     * metodo che consente di confrontare due oggetti dello stesso tipo in base all'area
     * @param altro oggetto dello stesso tipo con qui va confrontato
     * @return 1 se l'area dell'oggetto attuale è maggiore.
     * 0 se le aree sono uguali.
     * -1 se l'area dell'oggetto attuale è minore.
     */
    public int compareTo(Quadrato altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    /**
     * metodo che consente di stampare le informazioni del quadrato
     * @return Stringa formattata contenenti le informazioni
     */
    public String getInformazioni(){
        return String.format("Il quadrato ha lato %.2f area:%.2f",this.lato,this.calcolaArea());
    }
}