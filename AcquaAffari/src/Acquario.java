import java.util.ArrayList;

public class Acquario {
    private String codiceIdentificativo;
    private double volume;
    private boolean dolce;
    private ArrayList<Animale> animaliPresenti;

    public Acquario(String codiceIdentificativo, double volume, boolean dolce) {
        this.codiceIdentificativo = codiceIdentificativo;
        this.volume = volume;
        this.dolce = dolce;
        this.animaliPresenti = new ArrayList<>();
    }

    // Getters e Setters
    public String getCodiceIdentificativo() { return codiceIdentificativo; }
    public void setCodiceIdentificativo(String codiceIdentificativo) { this.codiceIdentificativo = codiceIdentificativo; }
    public double getVolume() { return volume; }
    public void setVolume(double volume) { this.volume = volume; }
    public boolean isDolce() { return dolce; }
    public void setDolce(boolean dolce) { this.dolce = dolce; }
    public ArrayList<Animale> getAnimaliPresenti() { return animaliPresenti; }

    // Metodi
    public void aggiungiAnimale(Animale animale) {
        this.animaliPresenti.add(animale);
    }
}