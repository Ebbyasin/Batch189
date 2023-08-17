package day03wrapperconcatenationoperators;
//java nini util library sinden scanner class import edildi
import java.util.Scanner;

public class Scanner01 {

    public static void main (String [] args){
        // 1.adim : Scanner Class in dan object olustur.
        Scanner input = new Scanner(System.in);

        // 2.adim : Kullanciya ne istedigine dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz..");

        // 3.adim : Uygun methodu kullanarak kullanicinin verdigi data yi memory ye yerlestiriniz
        byte age=input.nextByte();// kullanicinin verdigi bilgiyi input objectiyle alir,byte data tipinde kavanoza kor..

        System.out.println(age);


    }
}
