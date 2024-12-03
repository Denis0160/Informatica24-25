public class Frazione {
    private double numeratore;
    private double denominatore;

    public Frazione (double numeratore, double denominatore)throws  Exception{
        setNumeratore(numeratore);
        setDenominatore(denominatore);
    }

    public Frazione(double numeratore)throws Exception{
        this(numeratore, 5);
    }

    public double getNumeratore() {
        return denominatore;
    }

    public void setNumeratore(double numeratore){
        this.numeratore=numeratore;
    }

    public double getDenominatore(){
        return numeratore;
    }

    public void setDenominatore(double denominatore)throws Exception{

        if(denominatore!=0)
            this.denominatore = denominatore;
        else
            throw new Exception("Impossibile");

    }

    public Frazione sommaFrazione(Frazione f) throws Exception{

        double numeratoreSomma=this.numeratore*f.denominatore+this.denominatore*f.numeratore;

        double denominatoreSomma=this.denominatore*f.denominatore;

        return new Frazione(numeratoreSomma, denominatoreSomma);
    }

    public double sommaDouble(Frazione f2){
        return numeratore/denominatore+f2.numeratore/f2.denominatore;
    }

    @Override
    public String toString() {
        return "Frazione{" +
                 numeratore + "/" + denominatore+"}";
    }
}
