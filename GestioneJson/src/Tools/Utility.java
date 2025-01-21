package Tools;
import java.util.Scanner;
public class Utility {
    /*public static void main(String[] args) {

    }*/
    private Utility()
    {}; //impedisce di istanziare la classe
    /*
    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     */

    public static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int Menu(String opzioni[], Scanner tastiera) {// parametri formali
        int scelta;

        do {

            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println("[" + i + "]" + " " + opzioni[i]);
            }
            scelta = (Integer.parseInt(tastiera.nextLine()));
            //tastiera.nextLine();
            if ((scelta < 1) || (scelta > opzioni.length - 1)) {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1) || (scelta > opzioni.length - 1));
        //tastiera.nextLine();
        return scelta;
    }

    public static String[] fileFilter(String[] fileDirectory, String extension) {
        int palle = 0;
        for (int i = 0; i < fileDirectory.length; i++) {
            if(fileDirectory[i].endsWith(extension)) {
                palle++;
            }
        }
        String[] fileFilter = new String[palle];
        for (int i = 0; i < fileDirectory.length; i++) {
            if(fileDirectory[i].endsWith(extension)) {
                fileFilter[i] = fileDirectory[i];
            }
        }
        return fileFilter;
    }

}