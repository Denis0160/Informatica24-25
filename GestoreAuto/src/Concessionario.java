import java.util.ArrayList;
import java.util.List;

public class Concessionario {
    private List<Auto> autoList;

    public Concessionario() {
        this.autoList = new ArrayList<>();
    }

    public void aggiungiAuto(Auto auto) {
        autoList.add(auto);
    }

    public void rimuoviAuto(int id) {
        autoList.removeIf(auto -> auto.getId() == id);
    }

    public Auto cercaAutoPerMarca(String marca) {
        for (Auto auto : autoList) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                return auto;
            }
        }
        return null;
    }

    public List<Auto> visualizzaAutoPerAnno(int anno) {
        List<Auto> result = new ArrayList<>();
        for (Auto auto : autoList) {
            if (auto.getAnnoImmatricolazione().getYear() >= anno) {
                result.add(auto);
            }
        }
        return result;
    }

    public double calcolaValoreAttuale(Auto auto) {
        int anni = 2025 - auto.getAnnoImmatricolazione().getYear();
        double valoreAttuale = auto.getPrezzo();
        for (int i = 0; i < anni; i++) {
            valoreAttuale *= 0.95; // Svalutazione del 5% per ogni anno
        }
        return valoreAttuale;
    }

    public void mostraDettagli(Auto auto) {
        System.out.println(auto.toString());
    }
}
