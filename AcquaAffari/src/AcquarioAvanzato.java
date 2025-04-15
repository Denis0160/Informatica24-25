import java.util.ArrayList;

public class AcquarioAvanzato extends Acquario {
    private ArrayList<Sensore> sensori;

    public AcquarioAvanzato(String codiceIdentificativo, double volume, boolean dolce) {
        super(codiceIdentificativo, volume, dolce);
        this.sensori = new ArrayList<>();
    }

    public ArrayList<Sensore> getSensori() { return sensori; }

    public void aggiungiSensore(Sensore sensore) {
        this.sensori.add(sensore);
    }
}