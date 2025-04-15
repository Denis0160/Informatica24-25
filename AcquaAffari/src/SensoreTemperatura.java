public class SensoreTemperatura implements Sensore {
    private double temperatura;

    public SensoreTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String getTipo() {
        return "temperatura";
    }

    @Override
    public double leggiValore() {
        return temperatura;
    }
}