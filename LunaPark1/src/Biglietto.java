import utility.Giostre;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Biglietto {
    public String nome;
    public String cognome;
    public int id;
    private static int contatoreId = 0;
    LocalTime oraEntrata;
    LocalDate dataEntrata;
    public Giostre giostreFatte;
    public final DateTimeFormatter formattazioneData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Biglietto() {
        this.id = assegnaId();  // Assegna un ID unico incrementato automaticamente
    }
    private static int assegnaId() {
        contatoreId++;
        return contatoreId;  // Incrementa il contatore e restituisce il nuovo ID
    }

    @Override
    public String toString(){
        return String.format("Nome: %s   Cognome: %s   ID: %d   Data Entrata: %s   Ora Entrata: %s",
                nome, cognome, id, dataEntrata.format(formattazioneData), oraEntrata.toString());
    }
}
