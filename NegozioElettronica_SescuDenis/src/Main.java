import java.util.Scanner;
import static Utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        NegozioElettronica negozio = new NegozioElettronica();
        Scanner scanner = new Scanner(System.in);
        String[] opzioni = {
                "Negozio Elettronica",
                "1. Inserire nuovo smartphone",
                "2. Rimuovere prodotto esistente",
                "3. Cercare prodotto per codice",
                "4. Modificare prezzo prodotto",
                "5. Visualizzare elenco prodotti",
                "6. Uscire"
        };

        while (true) {
            try {
                switch (Menu(opzioni, scanner)) {
                    case 1:
                        System.out.print("Codice prodotto: ");
                        String codice = scanner.nextLine();
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Prezzo: ");
                        double prezzo = scanner.nextDouble();
                        System.out.print("Modello: ");
                        scanner.nextLine(); // Consuma il newline
                        String modello = scanner.nextLine();
                        System.out.print("Memoria (GB): ");
                        int memoria = scanner.nextInt();
                        if (prezzo <= 0 || memoria <= 0) {
                            System.out.println("Prezzo e memoria devono essere maggiori di 0.");
                            break;
                        }
                        negozio.aggiungiProdotto(new Smartphone(codice, marca, prezzo, modello, memoria));
                        break;
                    case 2:
                        System.out.print("Codice prodotto da rimuovere: ");
                        codice = scanner.nextLine();
                        negozio.rimuoviProdotto(codice);
                        break;
                    case 3:
                        System.out.print("Codice prodotto da cercare: ");
                        codice = scanner.nextLine();
                        ProdottoElettronico prodotto = negozio.cercaProdotto(codice);
                        System.out.println(prodotto);
                        break;
                    case 4:
                        System.out.print("Codice prodotto: ");
                        codice = scanner.nextLine();
                        System.out.print("Nuovo prezzo: ");
                        prezzo = scanner.nextDouble();
                        negozio.modificaPrezzo(codice, prezzo);
                        break;
                    case 5:
                        negozio.visualizzaProdotti();
                        break;
                    case 6:
                        System.out.println("Uscita...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opzione non valida.");
                }
            } catch (ProdottoEsistenteException | ProdottoNonTrovatoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}