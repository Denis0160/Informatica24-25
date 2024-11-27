public class Punto {
    protected int x;
    protected int y;
    private int quadrante;

    // Costruttore di default
    public Punto() {
        this.x = 0; // Valore iniziale
        this.y = 0; // Valore iniziale
        this.quadrante = definisciQuadrante(this.x, this.y); // Calcola il quadrante
    }

    // Costruttore parametrizzato
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        this.quadrante = definisciQuadrante(this.x, this.y); // Calcola il quadrante
    }

    // Metodo per calcolare il quadrante dato x e y
    private static int definisciQuadrante(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0; // Origine o assi
        }
    }

    // Getter per x
    public int getX() {
        return x;
    }

    // Setter per x
    public void setX(int x) {
        this.x = x;
        this.quadrante = definisciQuadrante(this.x, this.y); // Ricalcola il quadrante
    }

    // Getter per y
    public int getY() {
        return y;
    }

    // Setter per y
    public void setY(int y) {
        this.y = y;
        this.quadrante = definisciQuadrante(this.x, this.y); // Ricalcola il quadrante
    }

    // Getter per il quadrante
    public int getQuadrante() {
        return quadrante;
    }

    // Metodo toString
    @Override
    public String toString() {
        return String.format("x: %d y: %d Quadrante: %d", x, y, quadrante);
    }

    public void traslaPunto(int x, int y){
        this.x=this.getX()+x;
        this.y=this.getY()+y;
    }

}