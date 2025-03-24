import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NegozioElettronica {
    private List<ProdottoElettronico> prodotti = new ArrayList<>();

    public void aggiungiProdotto(ProdottoElettronico prodotto) throws ProdottoEsistenteException {
        if (prodotti.stream().anyMatch(p -> p.getCodiceProdotto().equals(prodotto.getCodiceProdotto()))) {
            throw new ProdottoEsistenteException("Prodotto con codice " + prodotto.getCodiceProdotto() + " già esistente.");
        }
        prodotti.add(prodotto);
    }

    public void rimuoviProdotto(String codiceProdotto) throws ProdottoNonTrovatoException {
        ProdottoElettronico prodotto = prodotti.stream()
                .filter(p -> p.getCodiceProdotto().equals(codiceProdotto))
                .findFirst()
                .orElseThrow(() -> new ProdottoNonTrovatoException("Prodotto con codice " + codiceProdotto + " non trovato."));
        prodotti.remove(prodotto);
    }

    public ProdottoElettronico cercaProdotto(String codiceProdotto) throws ProdottoNonTrovatoException {
        return prodotti.stream()
                .filter(p -> p.getCodiceProdotto().equals(codiceProdotto))
                .findFirst()
                .orElseThrow(() -> new ProdottoNonTrovatoException("Prodotto con codice " + codiceProdotto + " non trovato."));
    }

    public void modificaPrezzo(String codiceProdotto, double nuovoPrezzo) throws ProdottoNonTrovatoException {
        ProdottoElettronico prodotto = cercaProdotto(codiceProdotto);
        prodotto.setPrezzo(nuovoPrezzo);
    }

    public void visualizzaProdotti() {
        prodotti.forEach(System.out::println);
    }
}