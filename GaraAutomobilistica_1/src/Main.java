public class Main {
    public static void main(String[] args) {
        Gara gara1=new Gara("Gara del Veneto");

        Pilota pilota1=new Pilota("Pippo");
        Pilota pilota2=new Pilota("Franco");
        Pilota pilota3=new Pilota("Luigi");

        gara1.aggiungiPilota(pilota1);
        gara1.aggiungiPilota(pilota2);
        gara1.aggiungiPilota(pilota3);

        gara1.corriGara();


        System.out.println("Il vincitore della gara " + gara1.getNome() + " è: " + gara1.getRisultato());
    }
}