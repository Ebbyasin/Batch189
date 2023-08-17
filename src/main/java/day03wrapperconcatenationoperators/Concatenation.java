package day03wrapperconcatenationoperators;

public class Concatenation {

    public static void main (String[] args) {

        //Ornek 1: Bir String ve iki integer variable olusturun. String degeri ile
        //Integer larin toplamini consola yazdirin

        String s = "elma";
        int a= 10;
        int b= 11;

        System.out.println(s+a+b); //elma1011
        //java normalde soldan saga islem yapar,önce String le islem old.icin Stringdir
        System.out.println(s+a*b); //elma110-
        //burada soldan baslayamaz,cunku islem önceligi carpmadadir
        System.out.println(s+(a+b));//elma21
        //islem önceligi parantezdedir
        System.out.println(a+b+s);// 21elma
        System.out.println(a+s+b);//10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda ku-
        // llanilirsa concatenation islemi olur
        //Concatenation islemi birlestirme yapar.
        //Note:Concatenation islemlerinde java matematikteki islem onceligini kullanir

        /*

        Matematikte islem önceligi
        1)Once uslu sayilar
        2)Parantez ici islemler
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir.

         */
    }
}
