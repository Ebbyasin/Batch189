package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

                        /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;
                  60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;
                 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

        Scanner input=new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("Yasinizi giriniz");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Lutfen yasi 0 ile 120 arasinda giriniz");

        } else if (gender.equalsIgnoreCase("Kadin")) {

            if (age > 60) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Calismali...");
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {

            if (age > 65) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Kesinlikle Calismali...");
            }

        } else {
            System.out.println("Tanimli degil...");
        }

        /*   İNGİLİZCE İFADELERLE

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender and age. ");

        String gender = input.next();
        byte age = input.nextByte();

        if (gender.equalsIgnoreCase("male")) {
            if (age < 0 || age > 120){
                System.out.println("Invalid data");
            }
            else if (age > 65) {
                System.out.println("Maybe retired");
            }

            else {
                System.out.println("Not retired");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age < 0 || age > 120) {
                                System.out.println("Invalid data");
                            }
            else if (age > 60){
                System.out.println("Maybe retired");

            }

            else {
                System.out.println("Not retired");
            }
        }
        else {
            System.out.println("Inlavid data");
        }


       */





    }
}
