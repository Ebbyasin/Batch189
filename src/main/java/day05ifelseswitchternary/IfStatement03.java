package day05ifelseswitchternary;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String [] args){

        /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz..");
        byte age=input.nextByte();

        if (age<0){
            System.out.println("Gecerli bir yas giriniz");
        }else if (age<5){
            System.out.println("bebek");
        }else if (age<13){
            System.out.println("cocuk");
        }else if (age<21){
            System.out.println("genc");
        }else if (age<31){
            System.out.println("yetiskin");

        }else {
            System.out.println("Tanimlanmamis yas");
        }
        //ya bastan ya da sondan cozum formulu olusturmak daha mantikli..best practice acisindan...

    }
}
