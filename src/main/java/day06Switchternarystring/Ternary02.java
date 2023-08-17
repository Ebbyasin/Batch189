package day06Switchternarystring;

public class Ternary02 {

    public static void main (String [] args){

        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int a=-315;
        a=Math.abs(a);//Burayi tekrar dinle*****

        String result=(a>99 && a<1000) ? "Sayi 3 basamaklidir" : " sayi 3 basamakli değildir";
        System.out.println(result);

        //Interwiew question

        /*
         Example: Verilen yilin "Artik Yil" (Leap Year) olup olmadigini kontrol eden kodu yaziniz.
         1)Yil 100 e bolunurse 400 e de bolunmelidir. 1600 ==> Leap   1800==>Leap degil
         29 Yil 100 e bolunmuyorsa 4 e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

        int year=2005;

        String result2=year%100==0 ? year%400==0 ? "Leap" : "Not Leap"  : year%4 ==0 ? "Leap" : "Not leap";

        System.out.println(result2);

    }

}
