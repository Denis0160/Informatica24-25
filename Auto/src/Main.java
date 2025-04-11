import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Concessionario concessionario = new Concessionario();

        AutoNuova nuova = new AutoNuova("1", "BMW", "E36", 40000, 2010, "GPL", 120);
        AutoCarro carro = new AutoCarro("1", "IVECO", "daily", 50000, 1990, 50);

        try {
            concessionario.aggiungiAuto(nuova);
            concessionario.aggiungiAuto(carro);
        } catch(IllegalArgumentException e) {
            System.out.println("Errore durante l'aggiunta automobili");
            return;
        }

        System.out.println("-- Automobili concessionario --");
        printArray(concessionario.getAutomobili());

        ArrayList<Auto> concessionarioAuto = concessionario.getAutomobili();
        concessionarioAuto.get(0).setPrezzo(20000);

        System.out.println("\n-- Automobili Modificate --");
        printArray(concessionarioAuto);
        System.out.println("\n-- Automobili concessionario --");
        printArray(concessionario.getAutomobili());
    }

    private static void printArray(ArrayList<Auto> input) {
        input.forEach(x -> System.out.println(x.mostraDettagli()));
    }
}
