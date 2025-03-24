class ProdottoEsistenteException extends Exception {
    public ProdottoEsistenteException(String message) {
        super(message);
    }
}

class ProdottoNonTrovatoException extends Exception {
    public ProdottoNonTrovatoException(String message) {
        super(message);
    }
}