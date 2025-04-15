public abstract class Animale {
    private String[] tipoDiCibo;
    private String specie;
    private boolean dolce;
    private double dimensioni;
    private boolean aggressivo;
    private double prezzo;
    private boolean convivenza;

    // Getters e Setters
    public String[] getTipoDiCibo() { return tipoDiCibo; }
    public void setTipoDiCibo(String[] tipoDiCibo) { this.tipoDiCibo = tipoDiCibo; }
    public String getSpecie() { return specie; }
    public void setSpecie(String specie) { this.specie = specie; }
    public boolean isDolce() { return dolce; }
    public void setDolce(boolean dolce) { this.dolce = dolce; }
    public double getDimensioni() { return dimensioni; }
    public void setDimensioni(double dimensioni) { this.dimensioni = dimensioni; }
    public boolean isAggressivo() { return aggressivo; }
    public void setAggressivo(boolean aggressivo) { this.aggressivo = aggressivo; }
    public double getPrezzo() { return prezzo; }
    public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
    public boolean isConvivenza() { return convivenza; }
    public void setConvivenza(boolean convivenza) { this.convivenza = convivenza; }

    public String mangia() {
        return String.join(", ", tipoDiCibo);
    }

    public abstract boolean puoConvivereCon(Animale altro);
}