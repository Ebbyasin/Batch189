package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {

    public static void main (String [] args){


            /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        //nextLine() method u kullanicidan cok kelimeli string almak icin kullanilir
        String fullName=input.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        byte age=input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        float height=input.nextFloat();

        System.out.println("Lutfen kilonuzu giriniz");
        short weight=input.nextShort();

        System.out.println("Lutfen medeni durumunuzu giriniz");
        String medeniHal=input.next();
        //next() methodu kullanicidan tek kelimeli string almak icin kullanilir.

        System.out.println("ad ve soyad : " + fullName +"\nyas : " + age + "\nboy : + " + height +" \nkilo : " + weight + "\nmedeni hal : " + medeniHal);

        /*
        HOCANIN YAPTİGİ
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
         */



    }
}
