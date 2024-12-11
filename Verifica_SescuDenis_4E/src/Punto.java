public class Punto {

    private double x;
    private double y;

    /**
     * costruttore dell'oggetto punto, il costruttore serve per istanziare l'oggetto nel main
     * e si passano i parametri perchè sono quelle che lo caratterizzano
     */
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x=x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y=y;
    }

    /**
     * questo metodo calcola la distanza tra due punti facendo la radice quadrata della differenza al quadrato delle x
     * e la somma della differenza al quadrato delle y
     * @param altro un'altro punto che viene passato come parametro
     * @return la distanza tra i due punti
     */
    public double distanza(Punto altro){
        return Math.sqrt(Math.pow(this.x-altro.getX(),2)+Math.pow(this.y-altro.getY(),2));
    }



}
