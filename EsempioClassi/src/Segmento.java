

public class Segmento {
    private Punto p1;
    private Punto p2;



    public Segmento(Punto p1, Punto p2){
        this.p1=p1;
        this.p2=p2;


    }
    public Punto getP1() {
        return p1;

    }
    public void setP1(Punto p1) {
        this.p1 = p1;

    }
    public Punto getP2() {
        return p2;

    }
    public void setP2(Punto p2) {
        this.p2 = p2;

    }

    //double risultato = Math.pow(base, esponente);


    private Double calcolaLunghezza(){
        return Math.sqrt(Math.pow(this.p1.getX()-this.p2.getX(),2)+Math.pow(this.p1.getY()-this.p2.getY(),2));
    }
    @Override
    public String toString(){
        return String.format("Lunghezza: %.2f", this.calcolaLunghezza());
    }

}
