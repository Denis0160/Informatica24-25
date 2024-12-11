public class Rettangolo {
    private double base;
    private double altezza;

    /**
     * costruttore del Rettangolo, permette di istanziare l'oggetto nel main
     * @param base base del Rettangolo
     * @param altezza dimensione dell'altezza del rettangolo
     */
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    public int compareTo(Rettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }

    /**
     * metodo che consente di calcolare il perimetro del rettangolo moltiplicando la base per 2 e l'altezza per 2
     * @return il perimetro del Rettangolo
     */
    public double calcolaPerimetro(){
        return (base*2)+(altezza*2);
    }

    /**
     * metodo dove stampo tutte le informazioni del rettangolo in modo che l'utente riesca a vedere
     * tutte le informazioni
     * @return Stringa formattata con tutte le informazioni
     */
    public String getInformazioni(){
        return String.format("Il rettangolo ha base %.2f, altezza %.2f, perimetro: %.2f, area:%.2f",
                this.base,this.altezza,this.calcolaPerimetro(),this.calcolaArea());
    }
}