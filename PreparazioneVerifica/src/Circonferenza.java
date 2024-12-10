public class Circonferenza {
    private double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }


    public String descrizione() {
        return String.format("Circonferenza con raggio %.2f",this.raggio);
    }
}