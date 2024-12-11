public class Circonferenza {
    private double raggio;


    /**
     * costruttore della circonferenza che ci permette di istanziarla nel main
     * @param raggio si passa la lunghezza del raggio come parametro perchè è l'elemento fondamentale
     * per avere una circonferenza
     */
    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }


    /**
     * Questo metodo calcola l'area della circonferenza
     * facendo pigreco* raggio alla seconda che è la formula per calcolare l'area di una circonferenza
     * @return L'area della circonferenza
     */
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    /**
     * Questo metodo ci permette di confrontare due oggetti dello stesso tipo in base all'area
     * degli oggetti
     * @param altro oggetto dello stesso tipo con qui va confrontato
     * @return 1 se l'area dell'oggetto attuale è maggiore.
     * 0 se le aree sono uguali.
     * -1 se l'area dell'oggetto attuale è minore.
     */
    public int compareTo(Circonferenza altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }
}