public class Giocatore {
    private String Nome;
    private Dado dado;
    private int numeroVittorie = 0;
    private int vittorieConsecutive = 0;
    private int bonus = 0;

    public Giocatore(String nome, int numeroFacce) {
        Nome = nome;
        dado = new Dado(numeroFacce);
    }

    public void incrementaNumeroVittorie() {
        this.numeroVittorie++;
    }

    public void incrementaVittorieConsecutive() {
        vittorieConsecutive++;
    }

    public void resetVittorieConsecutive() {
        vittorieConsecutive = 0;
    }

    public void assegnaBonus() {
        if (vittorieConsecutive >= 3) {
            bonus++;
            vittorieConsecutive = 0; // Azzeriamo dopo il bonus
        }
    }

    public int getBonus() {
        return bonus;
    }

    public Dado getDado() {
        return dado;
    }

    public int getNumeroVittorie() {
        return numeroVittorie;
    }

    public String getNome() {
        return Nome;
    }

    public String toPlayerString() {
        return String.format("nome:%s   valore Lancio;%s", getNome(), getDado());
    }
}
