import java.util.ArrayList;

public class parcheggioCoperto {
    Automobile[] autovip = new Automobile[3];
    int contatore = 0;
    ArrayList<Automobile> listaAuto = new ArrayList<Automobile>();
    public boolean aggiungiAutoVip(Automobile auto) {
        if (auto.isVip() && contatore < autovip.length) {
            autovip[contatore] = auto;
            contatore++;
            return true;
        } else {
            return false;
        }
    }

    public void aggiungiAutoVipDaLista(ArrayList<Automobile> listaAuto) {
        listaAuto.stream()
                .filter(Automobile::isVip)
                .sorted((auto1, auto2) -> {
                    int comparePotenza = Double.compare(auto2.getPotenzaCavalli(), auto1.getPotenzaCavalli());
                    if (comparePotenza == 0) {
                        return Double.compare(auto2.getValoreMacchina(), auto1.getValoreMacchina());
                    }
                    return comparePotenza;
                })
                .limit(autovip.length - contatore)
                .forEach(this::aggiungiAutoVip);
    }

}
