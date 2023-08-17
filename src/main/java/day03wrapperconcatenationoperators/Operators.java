package day03wrapperconcatenationoperators;

public class Operators {

    public static void main (String [] args){

        /*
        1)+,-,*,/ islemleri jaada matematikte kullanildigi gibi kullanilir
        Not 1: javada bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
        Not 2: Eger sonuc tamsayi degilse java sonucun ondalik kismini iptal ederek onu int e
        donusturur
        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman
        buyuk data tipinde olur.Buyuklukten kasit double in daha fazla alan kaplamasi..
         */

        int kisiSayisi=10;
        int paraMiktari=25;

        System.out.println(paraMiktari/kisiSayisi);//2

        int ogrenciSayisi=10;
        double ucretMiktari=25;
        System.out.println(ucretMiktari/ogrenciSayisi);//2.5

        /*
        2)java da " Logical Operators" AND ve OR islemler "Logical Operator" lardir..

              CAY      AND     KAHVE     SONUC
            true      &&      false     false
            false     &&      true      false
            false     &&      false     false
            true      &&      true      true

            Note : AND (&&) isleminden true alabilmek icin her sey true olmalidir
            AND islemi perfectionist tir, bir tane bile false sonucu false yapar

            CAY       OR      KAHVE     SONUC
            true      ||      false     true
            false     ||      true      true
            false     ||      false     false
            true      ||      true      true

             Note :OR (||) isleminde bir tane true sonucu true yapmak icin yeterlidir
            OR isleminde sonucun false olabilmesi icin hersey false olmalidir

         3) NOT operatoru ( ! )  true olani false, false olani true yapar.
            !true  ===> false
            !false ===> true
            !!true ===> true

         4) Comparison (Karsilastirma) Operators
            <,>, <=, >=, == , !=

          NOTE: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz


        boolean first = 3 < 5;
        boolean second = 2 + 3 != 5;
        boolean third = 2 + 3 * 5 >= 19;

        System.out.println(first && second);//false
        System.out.println( first || second || third);//true

         */
    }
}
