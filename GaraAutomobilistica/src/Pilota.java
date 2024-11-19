public class Pilota {
    protected String nome;
    protected String cognome;
    protected String nazionalita;
    protected  int  eta;

    public Pilota(String nome, String cognome, String nazionalita, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
        this.eta = eta;
    }
    public String getNome() {
        return nome;

    }
    public String getCognome() {
        return cognome;

    }
    public String getNazionalita() {
        return nazionalita;

    }
    public int getEta() {
        return eta;

    }
    public void setNome(String nome) {
        this.nome = nome;

    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return String.format("nome:%s  cognome:%s  nazionalita:%s  eta:%s", nome, cognome, nazionalita, eta);
    }
}
