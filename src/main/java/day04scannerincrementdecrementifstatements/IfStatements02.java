package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main (String [] args){

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num=input.nextInt();

        //1.yol
        if (num%2==0){// '== ifadesi eşittir demektir,= ifadesi assigment yani atama dir...
            System.out.println("Cift sayidir");
        }
        if (num%2!=0){
            System.out.println("Tek sayidir");

            // *****Burada onemli olan bir bilgi şu:sadece if lerden olusan bir soruda java bütün
            //if leri calistirir.birincide olumlu olunca durmaz.devam eder..ikinciye de bakar.

        // 2.yol
        // if else statements

        if (num%2==0){

            System.out.println("Cift Sayi");
        }else {
            System.out.println("Tek Sayi");
        }



        }
    }
}
