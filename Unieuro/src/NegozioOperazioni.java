public interface NegozioOperazioni {
    void aggiungiProdotto(ProdottoElettronico prodotto) throws Exception;
    void visualizza();
    void rimuoviProdotto(ProdottoElettronico prodotto) throws Exception;
    boolean codiceEsistente(ProdottoElettronico prodotto);
    ProdottoElettronico cercaProdotto(String codice);
    void modificaPrezzo(String codice, double nuovoPrezzo) throws Exception;
}
