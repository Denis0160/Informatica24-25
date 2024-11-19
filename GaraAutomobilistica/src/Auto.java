public class Auto {
    private String scuderia;
    Pilota pilota;
    private String cilindrata;

    public Auto(String scuderia, Pilota pilota) {
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.cilindrata = scuderia;
    }
    public String getScuderia() {
        return scuderia;

    }
    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }
    public Pilota getPilota() {
        return pilota;
    }
    public void setPilota(Pilota pilota) {
        this.pilota = pilota;
    }
    public String getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return String.format("Pilota: %s Scuderia:%s  cilindrata:%s", pilota, scuderia, cilindrata);
    }

}
