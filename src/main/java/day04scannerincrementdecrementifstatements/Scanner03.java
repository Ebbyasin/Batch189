package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String [] args){

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input=new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenar uzunlugunu giriniz");
        int shortSide=input.nextInt();
        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz");
        int longSide=input.nextInt();

        System.out.println("dikdortgenin alani : " +(shortSide*longSide));
        System.out.println("dikdortgenin cevresi : " +2*(shortSide+longSide));
        //hocanin yukarda gosterdigi formul ile cevre:
        //System.out.println("dikdortgenin cevresi : " +(2*shortSide+2*longSide));


    }
}
