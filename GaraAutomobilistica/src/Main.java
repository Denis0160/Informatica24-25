import java.util.ArrayList;
import java.util.Scanner;
import static Tools.Utility.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pilota> piloti= new ArrayList<>();
        ArrayList<Auto>autos= new ArrayList<>();

        String[] opzioni={"AUTOMOBILISTI","Inserisci Pilota","Aggiungi auto","Visualizza piloti","visualizza auto","Fine"};
        boolean fine=true;
        do{
        switch (Menu(opzioni,scanner)){
            case 1->{
                Pilota pilota=creaPilota(scanner);
                try{
                    for(Pilota p:piloti){
                        if(p.getNome().equals(pilota.getNome())&& p.getCognome().equals(pilota.getCognome())&&p.getEta()==pilota.getEta()){
                            throw new Exception("Il pilota è già presente");
                        }

                    }
                    piloti.add(pilota);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
            case 2->{
                Auto auto=creaAuto(scanner,piloti);
                try {
                    for(Auto a:autos){
                        if(a.getScuderia().equals(auto.getScuderia())){
                            throw new Exception("L'auto è già presente");
                        }
                    }
                       autos.add(auto);

                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            case 3->{
                for(Pilota pilota:piloti){
                    System.out.println(pilota.toString());
                }
            }
            case 4->{
                for(Auto auto:autos){
                    System.out.println(auto.toString());
                }
            }

            case 5 ->{
                fine=false;
            }
        }
        }
        while(fine);



    }
    private static Pilota creaPilota(Scanner scanner){
        Pilota pilota=new Pilota("","","",0);
        System.out.printf("Inserisci il nome del pilota\n");
        String nome=scanner.nextLine();
        pilota.setNome(nome);
        System.out.printf("Inserisci il cognome del pilota\n");
        String cognome=scanner.nextLine();
        pilota.setCognome(cognome);
        System.out.println("Inserisci la nazionalità\n");
        String nazionalit=scanner.nextLine();
        pilota.setNazionalita(nazionalit);
        System.out.println("Inserisci l'età del pilota\n");
        String eta1;
        eta1=scanner.nextLine();
        int eta;
        eta =Integer.parseInt(eta1);
        pilota.setEta(eta);


        return pilota;
    }

    private static Auto creaAuto(Scanner scanner, ArrayList<Pilota> pilota){
        Auto auto=new Auto("",null);
        System.out.println("Inserisci il nome della scuderia\n");
        String nome=scanner.nextLine();
        auto.setScuderia(nome);
        System.out.println("inserisci la cilindrata\n");
        String cilindrata=scanner.nextLine();
        auto.setCilindrata(cilindrata);

        boolean c=false;
        System.out.println("Inserisci il nome del pilota\n");
        String nome1=scanner.nextLine();
        for(Pilota p:pilota){
            if(p.getNome().equals(nome1)){
                auto.setPilota(p);
                c=true;
            }
        }
        if(c==false){
            System.out.println("Il pilota non c'è\n");
        }

        return auto;

    }




}