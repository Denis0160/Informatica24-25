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
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
    private static Punto creaPunto(Scanner scanner){
        System.out.println("Inserisci la x\n");
        int x=0,y=0;
        x=scanner.nextInt();
        System.out.println("Inserisci la y \n");
        y=scanner.nextInt();;
        return new Punto(x,y);
    }
}
