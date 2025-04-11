import java.util.ArrayList;


public class Concessionario {
    private ArrayList<Auto> automobili;

    public Concessionario() {
        automobili = new ArrayList<>();
    }

    public void aggiungiAuto(Auto aggiunta) throws IllegalArgumentException {
        int search = automobili.indexOf(aggiunta);

        if(search >= 0) {
            throw new IllegalArgumentException("Auto passata e' presente nella lista");
        }

        automobili.add(aggiunta);
    }

    public ArrayList<Auto> getAutomobili() {
        ArrayList<Auto> clone = new ArrayList<>();

        for(Auto current : automobili) {
            clone.add(current.clone());
        }

        return clone;
    }
}
