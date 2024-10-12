import java.util.InputMismatchException;
import java.util.Scanner;

class Main{
    public static void main(String[] Args){


        /*
        int [] array={1,2,3,5};
        try {
            for(int i=0;i<= array.length;i++){
                System.out.println(array[i]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("il programma continua\n");
        */
        Scanner scanner=new Scanner(System.in);

        int n1=0, n2=0;
        double divisione=0;
        int controllo=1;

        /*

        do {
            try {
                controllo=1;
                System.out.println("inserisci il primo numero\n");
                n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci il secondo numero\n");
                n2 = Integer.parseInt(scanner.nextLine());

                if(n2==0){
                    throw new ArithmeticException("il divisore non può essere 0");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                controllo = -1;
            }
        }while (controllo==-1);

        divisione=n1/n2;

         */


        //System.out.println(divisione);

        do {
            try {
                controllo=1;
                System.out.println("inserisci il primo numero\n");
                n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci il secondo numero\n");
                n2 = Integer.parseInt(scanner.nextLine());
                divisione=Divisione(n1,n2);



            } catch (Exception e) {
                System.out.println(e.getMessage());
                controllo = -1;
            }
        }while (controllo==-1);

        System.out.println(divisione);





        /*
        do {
            try {
                controllo = false;
                getInteger(scanner);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                controllo=true;
            }
        }while(controllo);
        */
    }
    private static int getInteger(Scanner scanner)throws Exception{
        int num=-1;
        System.out.println("inserisci un valore: ");
        num=Integer.parseInt(scanner.nextLine());
        if(num >= 0) {
            return num;
        }else{
            throw new Exception("Valore non valido");
        }
    }

    private static double Divisione(int n1, int n2)throws Exception{


        if(n2!=0){


            return n1/n2;

        }
        else {
            throw new ArithmeticException("Non puoi dividere per 0");
        }
    }
}