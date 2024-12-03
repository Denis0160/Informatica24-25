import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Pilota {
    private String nome;
    private int tempo;  // Tempo per completare la gara in secondi

    // Costruttore
    public Pilota(String nome) {
        this.nome = nome;
        this.tempo = new Random().nextInt(180) + 120;  // Genera un tempo tra 120 e 300 secondi
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Getter per il tempo
    public int getTempo() {
        return tempo;
    }
}
