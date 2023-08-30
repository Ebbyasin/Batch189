package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime); // 17:34:50.822632700

         /*
        DateTime Class ta kullanilan tarih saat formatlari
            HH : mm ==> 24'lu saat sistemi
            hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
            hh : mm a ==> 12'li saat sistemi AM, PM
            HH : mm : ss==> saniyeyi gosterir

            HH : MM ==> yanlis format cunku MM aylar icin kullanilir
            "mm" "minute" demektir. "MM" "month" demektir.

            dd-MM-yyyy ==> gun - ay - yil
            MMM ==> Aug
            MMMM ==> August  */

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime=dtf1.format(myCurrentTime);// format methodu bize String döndurur.
        System.out.println("formattedTime = " + formattedTime);

        //Date formati
        LocalDate myCurrentDate=LocalDate.now();
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MMMM*dd*yyyy");
        String formattedMyCurrentDate=dtf2.format(myCurrentDate);
        System.out.println("formattedMyCurrentDate = " + formattedMyCurrentDate);

        //30/Aug/2023
        LocalDate myCurrentDate01=LocalDate.now();
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate01=dtf3.format(myCurrentDate01);
        System.out.println("formattedMyCurrentDate01 = " + formattedMyCurrentDate01);

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo da ayin kaçi?
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo da saat kaçtir?
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Londra da saat kaçtir?
        LocalTime timeInLondon=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(timeInLondon);

        LocalDateTime ltd=LocalDateTime.now(); // saat ve tarihi ayni anda verir
        System.out.println(ltd); //2023-08-30T18:10:59.938988300

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("dd * MM * yyyy - hh : mm");
        String formattedLdt=dtf4.format(ltd);
        System.out.println("formattedLdt = " + formattedLdt);//30 * 08 * 2023 - 06 : 16


    }
}
