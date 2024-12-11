public class TriangoloRettangolo {
    private double base;
    private double altezza;

    /**
     * costruttore delo triangolo che consente di istanziarlo nel main
     * @param base base del triangolo
     * @param altezza altezza del triangolo
     */
    public TriangoloRettangolo(double base, double altezza) {
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
        return (base * altezza) / 2;
    }

    /**
     * metodo per stampare le informazioni di un triangolo come la base, l'altezza, e l'area
     * @return Stringa formattata contenenti le informazioni
     */
    public String getInformazioni(){
        return String.format("Il triangolo ha base %.2f, altezza %.2f, area:%.2f",this.base,this.altezza,this.calcolaArea());
    }

    /**
     * metodo che consente di confrontare due oggetti dello stesso tipo in base all'area
     * @param altro oggetto dello stesso tipo con qui va confrontato
     * @return 1 se l'area dell'oggetto attuale è maggiore.
     * 0 se le aree sono uguali.
     * -1 se l'area dell'oggetto attuale è minore.
     */
    public int compareTo(TriangoloRettangolo altro) {
        double areaQuesto = this.calcolaArea();
        double areaAltro = altro.calcolaArea();
        return Double.compare(areaQuesto, areaAltro);
    }
}