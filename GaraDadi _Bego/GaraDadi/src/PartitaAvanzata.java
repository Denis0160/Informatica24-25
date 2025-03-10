public class PartitaAvanzata extends Gara {

    public PartitaAvanzata(String nomeGiocatore1, String nomeGiocatore2, int numeroRound) {
        super(nomeGiocatore1, nomeGiocatore2, numeroRound);
    }

    @Override
    public String giocaRound() {
        String esito = super.giocaRound();
        if (roundAttuale < nRound) {
            // Aggiungiamo la logica per le vittorie consecutive e il bonus
            if (giocatori[0].getDado().getValoreLancio() > giocatori[1].getDado().getValoreLancio()) {
                giocatori[0].incrementaVittorieConsecutive();
                giocatori[0].assegnaBonus();
                giocatori[1].resetVittorieConsecutive();
            } else if (giocatori[0].getDado().getValoreLancio() < giocatori[1].getDado().getValoreLancio()) {
                giocatori[1].incrementaVittorieConsecutive();
                giocatori[1].assegnaBonus();
                giocatori[0].resetVittorieConsecutive();
            } else {
                giocatori[0].resetVittorieConsecutive();
                giocatori[1].resetVittorieConsecutive();
            }
        }
        return esito;
    }

    @Override
    public String Winner() {
        String esito = super.Winner();
        if (roundAttuale == nRound) {
            esito += String.format("\nBonus giocatore 1: %d", giocatori[0].getBonus());
            esito += String.format("\nBonus giocatore 2: %d", giocatori[1].getBonus());
        }
        return esito;
    }
}
