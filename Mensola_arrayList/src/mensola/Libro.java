package mensola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {
    public String autore;
    public String titolo;
    public int numeroPagine;
    public double costoPerPagina = 0.05;
    public Genere tipologia;


    @Override
    public String toString() {
        return String.format("Autore: %s; Titolo: %s; Numero di pagine %s; Prezzo: %.2f; Genere: %s;\n",
                autore, titolo, numeroPagine, numeroPagine * costoPerPagina, tipologia.toString());
    }

}