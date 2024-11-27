import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Punto p1,p2;

        p1=creaPunto(scanner);
        p2=creaPunto(scanner);

        //Segmento segmento=new Segmento(p1,p2,-1.0);
        //System.out.println(segmento.toString());

        try{
            Rettangolo rettangolo=new Rettangolo(p1,p2);
            System.out.println(rettangolo.toString());
            System.out.println(rettangolo.getP1()+" p1 prima della traslazione\n");
            System.out.println(rettangolo.getP2()+" p2 prima della traslazione\n");
            trasla(scanner,rettangolo);
            System.out.println(rettangolo.getP1()+" p1 dopo la traslazione\n");
            System.out.println(rettangolo.getP2()+" p2 dopo la traslazione\n");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }




    }
    private static Punto creaPunto(Scanner scanner){
        System.out.println("Inserisci la x\n");
        int x=0,y=0;
        boolean c1=false;

        do {
            try {
                x = Integer.parseInt(scanner.nextLine());
                c1=false;
            } catch (Exception e) {
                System.out.println("Input non valido. REINSERISCI!");
                c1=true;
            }
        }while(c1);

        System.out.println("Inserisci la y \n");
        do {
            try {
                y = Integer.parseInt(scanner.nextLine());
                c1=false;
            } catch (Exception e) {
                System.out.println("Input non valido. REINSERISCI!");
                c1=true;
            }
        }while(c1);

        return new Punto(x,y);
    }
    private static void trasla(Scanner scanner, Rettangolo rettangolo){
        int x=0, y=0;
        System.out.println("Inserisci di quanto vuoi traslare la x\n");
        x=Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci di quanto vuoi traslare la y\n");
        y=Integer.parseInt(scanner.nextLine());

        rettangolo.traslaRettangolo(x,y);
    }
}
