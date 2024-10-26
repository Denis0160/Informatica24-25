import mensola.Genere;
import mensola.Libro;

import static utility.Tools.*;

import java.util.ArrayList;
import java.util.Scanner;
import static mensola.Libro.*;


public class Main {
    public static void main(String[] args){
        String[] opzioni={"SCEGLI","Inserisci Libro",
                "visualizza libri scaffale",
                "cerca libro per titolo",
                "conta numero per autore",
                "Visualizza libri di un autore",
                "visualizza dettagli libro",
                "Esci"};


        Scanner scanner=new Scanner(System.in);
        boolean fine=true;
        ArrayList<Libro>mensola=new ArrayList<>();

        do {
            switch (Menu(opzioni, scanner)) {
                case 1: {
                    Libro libro = new Libro();
                    creaLibro(libro, scanner);
                    mensola.add(libro);
                    break;
                }
                case 2:{
                    for(Libro i:mensola){
                        System.out.println(i.toString());
                    }
                    break;
                }
                case 3:{
                    int j=cerca(scanner,mensola);
                    if(j!=-1){
                        System.out.println("Il libro è presente");
                        System.out.println(mensola.get(j));
                    }else
                        System.out.println("Il libro non è presente");

                    break;
                }
                case 4:{
                    int conta=contaLibriA(scanner,mensola);
                    if(conta!=0){
                        System.out.println("l'autore ha %d libri"+conta);
                    }
                    else
                        System.out.println("l'autore non ha libri");

                    break;
                }
                case 5:{
                    int j=cerca(scanner,mensola);
                    if(j!=-1){
                        visualizzaDettagli(mensola,j);
                    }else
                        System.out.println("Il libro non è presente");


                    break;
                }
                default:
                    fine=false;
                    break;

            }
        }while(fine);

    }
    private static Libro creaLibro(Libro libro, Scanner scanner){
        System.out.println("Inserisci il titolo del libro\n");
        String titolo;
        titolo=scanner.nextLine();
        libro.titolo=titolo;
        System.out.println("Inserisci l'autore del libro\n");
        String autore;
        autore=scanner.nextLine();
        libro.autore=autore;
        int pagine;
        System.out.println("Inserisci il numero di pagine\n");
        pagine=scanner.nextInt();
        libro.numeroPagine=pagine;
        scanner.next();
        Genere[] generi = Genere.values();
        String[] menuData = new String[generi.length + 1];
        menuData[0] = "Inserire Genere";
        for (int i = 0; i < generi.length; i++)
            menuData[i + 1] = generi[i].toString();
        int genereIndex = Menu(menuData, scanner) - 1;
        libro.tipologia = generi[genereIndex];
        return libro;
    }

    private static int cerca( Scanner scanner, ArrayList<Libro> mensola){
        String titolo;
        System.out.println("Inserisci il titolo del libro che vuoi cercare\n");
        titolo=scanner.nextLine();
        for(int i=0;i< mensola.size();i++){
            if(mensola.get(i).equals(titolo)){
                return i;
            }
        }
        return -1;
    }
    private static int contaLibriA(Scanner scanner, ArrayList<Libro> mensola){
        String autore;
        System.out.println("Inserisci l'autore per cui vuoi contare i libri\n");
        autore=scanner.nextLine();
        int k=0;
        for(int i=0;i< mensola.size();i++){
            if(mensola.get(i).autore.equals(autore)){
                k++;
            }
        }
        return k;
    }
    private static void visualizzaDettagli(ArrayList<Libro>mensola, int k){
        mensola.get(k).toString();
    }

}
