public class SensorePh implements Sensore {
    private double valorePh;

    public SensorePh(double valorePh) {
        this.valorePh = valorePh;
    }

    @Override
    public String getTipo() {
        return "Ph";
    }

    @Override
    public double leggiValore() {
        return valorePh;
    }
}