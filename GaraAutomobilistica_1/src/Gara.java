import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gara {
    private String nome;
    private String risultato;
    private List<Pilota> piloti;

    public Gara(String nome) {
        this.nome = nome;
        this.piloti = new ArrayList<>();
        this.risultato = "";
    }

    public void aggiungiPilota(Pilota pilota) {
        piloti.add(pilota);
    }

    public void corriGara(){
        if (piloti.isEmpty()){
            System.out.println("Nessun pilota iscritto alla gara!");
            return;
        }
        Random rand = new Random();
        Pilota vincitore = piloti.get(0);  // Inizialmente consideriamo il primo pilota come vincitore
        int tempoVincitore = rand.nextInt(181) + 120;  // Tempo tra 120 e 300 secondi
        System.out.println(vincitore.getNome() + " ha un tempo di " + tempoVincitore + " secondi.");
        for (Pilota pilota : piloti) {
            int tempoPilota = rand.nextInt(181) + 120;
            System.out.println(pilota.getNome() + " ha un tempo di " + tempoPilota + " secondi.");
            if (tempoPilota < tempoVincitore) {
                vincitore = pilota;
                tempoVincitore = tempoPilota;
            }
        }
        this.risultato = vincitore.getNome();
        System.out.println("Il vincitore della gara " + nome + " è " + risultato + " con un tempo di " + tempoVincitore + " secondi.");
    }
    public String getNome() {
        return nome;
    }
    public String getRisultato() {
        return risultato;
    }
}
