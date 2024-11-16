import java.lang.classfile.constantpool.DoubleEntry;

public class Segmento {
    private Punto p1;
    private Punto p2;
    private Double lunghezza;

    public Segmento(){
        this.p1=p1;
        this.p2=p2;
        this.lunghezza=lunghezza;
    }


    //double risultato = Math.pow(base, esponente);


    private static Double calcolaLunghezza(Punto p1,Punto p2){
        double lunghezza;
        double risultatoX=0, risultatoY=0, radice=0;
        risultatoX = p1.getX() - p2.getX();
        double potenzaX=Math.pow(risultatoX,2);
        risultatoY=p1.getY()-p2.getY();
        double potenzaY=Math.pow(risultatoY,2);
        radice=potenzaX+potenzaY;
        lunghezza=Math.sqrt(radice);
        //double radiceQuadrata = Math.sqrt(double valore);
        return lunghezza;
    }
}
