package day04scannerincrementdecrementifstatements;

public class IfStatements01 {
    public static void main (String [] args){

        // if Statement
        // bazi kodlarin bazi sartlara gore aktive edebilmek icin if statement kullanalir.

        //if you study hard,you will learn java.(sıkı calisirsan ingilizce ogrenebilirsin)

        /*
        if (you study hard){
            you will learn java  ===>> javaca
        }
        */

        //Ornek 1: sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin.

        int number =13;

        if (number>-1 && number <10){
            System.out.println("Rakam");
        }


        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        int n=123;

        if (n>99 && n<1000){ // hocanin musluk ornegi guzel.nasil;if bloguna girer tanimlanan
            // variable..and operatorde ilk sinamaya girer(n>99) burdan gecerse ikinciye girer,
            // false verirse gidemez cunku tek false and operatorunde false verir
            System.out.println("Sayi üç basamaklidir");
        }
    }
}
