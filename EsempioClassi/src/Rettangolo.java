public class Rettangolo {
    private Punto p1;
    private Punto p2;
    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    private double calcolaDiagonale(){
        return Math.sqrt(Math.pow(this.p1.getX()-this.p2.getX(),2)+Math.pow(this.p1.getY()-this.p2.getY(),2));
    }
    public Rettangolo(Punto p1, Punto p2)throws Exception{
        if(p1.getX()==p2.getX() || p1.getY()==p2.getY()){
            throw new Exception("I punti sono errati");
        }else{
            this.p1=p1;
            this.p2=p2;
        }
    }
    private double calcolaAltezza(){
        return Math.abs(this.p1.getY()-this.p2.getY());
    }
    private double calcoloBase(){
        return Math.abs(this.p1.getX()-this.p2.getX());
    }
    public boolean isRettangolo(){
        if(this.calcoloBase()!=this.calcolaAltezza()){
            return true;
        }
        else
            return false;
    }

    public double area(){
        return this.calcoloBase()*this.calcolaAltezza();
    }
    public double perimetro(){
        return (this.calcoloBase()*2)+(this.calcolaAltezza()*2);
    }

    @Override
    public String toString(){
        return String.format("base: %.2f  altezza: %.2f  diagonale: %.2f  rettangolo: %b   area: %.2f   perimetro: %.2f",this.calcoloBase(),this.calcolaAltezza(),
                this.calcolaDiagonale(),this.isRettangolo(),this.area(),this.perimetro());
    }

    public void traslaRettangolo(int x, int y){
        this.p1.traslaPunto(x, y);
        this.p2.traslaPunto(x, y);
    }







}
