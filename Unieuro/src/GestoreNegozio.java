import java.util.ArrayList;

public class GestoreNegozio implements NegozioOperazioni{
    private String nomeNegozio;
    private ArrayList<ProdottoElettronico> prodotti;

    public GestoreNegozio(String nomeNegozio) {
        this.nomeNegozio = nomeNegozio;
        prodotti = new ArrayList<>();
    }

    @Override
    public boolean codiceEsistente(ProdottoElettronico prodotto) {
        return prodotti.contains(prodotto);
    }

    @Override
    public void aggiungiProdotto(ProdottoElettronico prodotto) throws Exception {
        if (codiceEsistente(prodotto)) {
            throw new Exception("Codice già presente");
        }
        prodotti.add(prodotto);
    }

    @Override
    public void rimuoviProdotto(ProdottoElettronico prodotto) throws Exception {
        if (!prodotti.contains(prodotto)) {
            throw new Exception("Prodotto non trovato");
        }
        prodotti.remove(prodotto);  // Rimuove il prodotto dalla lista
    }

    public void visualizza() {
        if (prodotti.isEmpty()) {
            System.out.println("array vuoto");
        } else {
            prodotti.forEach(x -> System.out.println(x.toString()));
        }
    }
    @Override
    public void modificaPrezzo(String codice, double nuovoPrezzo) throws Exception {
        ProdottoElettronico prodotto = cercaProdotto(codice);
        if (prodotto == null) {
            throw new Exception("Prodotto non trovato");
        }
        prodotto.setPrezzo(nuovoPrezzo);
    }

    @Override
    public ProdottoElettronico cercaProdotto(String codice) {
        return prodotti.stream().filter(p -> p.getCodice().equals(codice)).findFirst().orElse(null);
    }

   // @Override
    /**public void rimuoviProdotto(ProdottoElettronico prodotto) throws Exception {
        if (!prodotti.removeIf(p -> p.equals(prodotto))) {
            throw new Exception("Prodotto non trovato");
        }
    }
     */




}