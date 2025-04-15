import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cognome;
    private String codiceCliente;
    private String email;
    private int nAcquari;
    private ArrayList<Acquisti> storicoAcquisti;

    public Cliente(String nome, String cognome, String codiceCliente, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceCliente = codiceCliente;
        this.email = email;
        this.nAcquari = 0;
        this.storicoAcquisti = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setCodiceCliente(String codiceCliente) { this.codiceCliente = codiceCliente; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getNAcquari() { return nAcquari; }
    public void setNAcquari(int nAcquari) { this.nAcquari = nAcquari; }
    public ArrayList<Acquisti> getStoricoAcquisti() { return storicoAcquisti; }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    // Metodi
    public void contaAcquar() {
        this.nAcquari++;
    }

    public void aggiungiAcquario() {
        contaAcquar();
    }

    public void aggiungiAcquisto(Acquisti acquisto) {
        this.storicoAcquisti.add(acquisto);
    }
}