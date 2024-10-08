import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate dataLocale= LocalDate.now();
        System.out.println("data: "+dataLocale.toString());
        //---------------------------------------------------------
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("data: "+dataLocale.format(dt));
        System.out.printf("data: %s"+"\n",dataLocale.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
        //---------------------------------------------------------
        String dataStringa= dataLocale.format(dt);

        dataLocale=LocalDate.parse(dataStringa, dt);
        System.out.println("Data: "+dataLocale);
        //----------------------------------------------------------

        System.out.println("Inserisci una data in formato gg/mm/aa\n");
        Scanner scanner=new Scanner(System.in);
        String dataInput;
        dataInput=scanner.nextLine();
        LocalDate dataNew=LocalDate.parse(dataInput,dt);
        System.out.println("data5: "+dataNew);

        //-------------------------------------------------------------
        String time="10.32.01";
        LocalTime ora=LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Ora:"+ora);

        //-----------------------------------------------------------------
        dataLocale=LocalDate.of(2024,10,6);
        int anno, mese, giorno;
        anno=dataLocale.getYear();
        mese=dataLocale.getMonthValue();
        giorno= dataLocale.getDayOfMonth();
        System.out.println("Data: "+anno+"/"+mese+"/"+giorno+"giorni mese"+dataLocale.lengthOfMonth());
        if(dataLocale.isLeapYear()){
            System.out.println("Bisestile\n");

        }
        


    }
}