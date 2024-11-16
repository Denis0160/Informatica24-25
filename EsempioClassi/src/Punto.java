public class Punto {
    protected int x;
    protected int y;
    private int quadrante;

    public Punto() {
        this.x = -10;
        this.y = 12;
        this.quadrante = definisciQuadrante(this.x, this.y); // Calcola il quadrante iniziale
    }

    // Metodo per calcolare il quadrante dato x e y
    private static int definisciQuadrante(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        this.quadrante = definisciQuadrante(this.x, this.y); // Ricalcola il quadrante ogni volta che x cambia
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        this.quadrante = definisciQuadrante(this.x, this.y);
    }


    public int getQuadrante() {
        return quadrante;
    }

    @Override
    public String toString() {
        return String.format("x: %d y: %d   Quadrante: %d", x, y, quadrante);
    }
}
