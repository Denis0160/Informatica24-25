import java.util.ArrayList;
import java.util.Scanner;
import static utility.Tools.*;

public class GestoreSolidi {
    private ArrayList<Solido> solidi;

    public GestoreSolidi() {
        solidi = new ArrayList<>();
    }

    public void inserisciCubo(double lato) {
        solidi.add(new Cubo(lato));
    }

    public void inserisciSfera(double raggio) {
        solidi.add(new Sfera(raggio));
    }

    public void visualizzaSolidi() {
        if (solidi.isEmpty()) {
            System.out.println("Nessun solido inserito.");
        } else {
            for (Solido solido : solidi) {
                System.out.println(solido);
            }
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        String[] opzioni = {"opzioni",
                "Inserisci un Cubo",
                "Inserisci una Sfera",
                "Visualizza Solidii",
                "Esci"
        };

        boolean fine = false;

        do {
            switch (Menu(opzioni, scanner)) {
                case 1:
                    System.out.print("Inserisci il lato del cubo: ");
                    double lato = scanner.nextDouble();
                    inserisciCubo(lato);
                    break;
                case 2:
                    System.out.print("Inserisci il raggio della sfera: ");
                    double raggio = scanner.nextDouble();
                    inserisciSfera(raggio);
                    break;
                case 3:
                    visualizzaSolidi();
                    break;
                default:
                   fine = true;
            }
        }while (!fine);
    }
}
