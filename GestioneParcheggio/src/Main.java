import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Automobile>listaAuto = new ArrayList<Automobile>();
        Automobile auto1 = new Automobile(true, 150, true, 20000);
        Automobile auto2 = new Automobile(false, 120, false, 15000);
        Automobile auto3 = new Automobile(false, 120, true, 15000);
        Automobile auto4 = new Automobile(true, 200, false, 25000);
        Automobile auto5 = new Automobile(false, 180, true, 30000);
        Automobile auto6 = new Automobile(true, 200, true, 25000);
        Automobile auto7 = new Automobile(true, 180, false, 30000);
        listaAuto.add(auto1);
        listaAuto.add(auto2);
        listaAuto.add(auto3);
        listaAuto.add(auto4);
        listaAuto.add(auto5);
        listaAuto.add(auto6);
        listaAuto.add(auto7);
        parcheggioCoperto parcheggio = new parcheggioCoperto();
        parcheggio.aggiungiAutoVipDaLista(listaAuto);
        System.out.println("Automobili nel parcheggio coperto:");
        for (Automobile auto : parcheggio.autovip) {
            if (auto != null) {
                System.out.println(auto.toString());
            }
        }

        System.out.println(auto1.toString());

    }

}