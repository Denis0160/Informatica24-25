import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            int numeratore, denominatore;
            System.out.println("inserisci il numeratore: \n");
            Scanner sc = new Scanner(System.in);
            numeratore = sc.nextInt();
            System.out.println("inserisci il denominatore: \n");
            denominatore = sc.nextInt();

            int num1, den1;
            System.out.println("inserisci il numeratore della seconda frazione: \n");
            num1 = sc.nextInt();
            System.out.println("inserisci il denominatore della seconda frazione: \n");
            den1 = sc.nextInt();

            Frazione f1 = new Frazione(numeratore, denominatore);
            Frazione f2 = new Frazione(num1, den1);


            System.out.println(f1.sommaFrazione(f2));

            System.out.println(f1.sommaDouble(f2));

            System.out.println(f1.toString());
            System.out.println(f2.toString());
        }catch(Exception e){
            System.out.println("Impossibile");
        }
    }
}
