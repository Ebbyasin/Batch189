package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String [] args){

            /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName = input.next();

        // BİRİNCİ YOL (DAHA KISA VE CLEAN CODE,DAHA ŞIK)

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");

        if (isWeekendDay) {
            System.out.println("Weekend Day");
        } else if (isWeekDay) {
            System.out.println("Week day");
        } else {
            System.out.println("Invalid day name..");
        }


        /*
        İKİNCİ YOL(KENDİM YAPTİM)
        if (dayName.equalsIgnoreCase("Saturday") || (dayName.equalsIgnoreCase("Sunday"))){
            System.out.println("Weekend Day");

        }else if (dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("tuesday") ||
        dayName.equalsIgnoreCase("wednesday") || dayName.equalsIgnoreCase("thursday") ||
        dayName.equalsIgnoreCase("friday")){
            System.out.println("Week Day");

        }else {
            System.out.println("Invalid day name..");
        }

         */


    }
}
