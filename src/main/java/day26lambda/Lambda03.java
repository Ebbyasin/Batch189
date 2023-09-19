package day26lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    /*
      Distinct    :Tekrarsız
Reduce      :Çoklu datanın teke indirilmesi(azaltılması)
Sorted      :Küçükten büyüğe sıralar.
RevoredOrder :Tersten sıralama yapar yani;büyükten küçüğe
Collect     :Topla demek.
Comparator  :Karşılaştırır ve sıralar(renkleri,uzunlukları)
RemoveIf    :Belli kurala uyuyorsa sil demek.
IntStream   :Tüm integerları stream formatında verir.Tam sayılardan oluşan aralık verir.
Range       :Başlangıç dahil, bitiş hariç
RangeClosed :Çoku teke redution yapmak. Seçim yapmak.
LongSream   :Uzunlukları verir.
GetAsInt    :Int gibi demek.
*/

    public static void main(String[] args) {
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplicationFromThreeToNine1());
        System.out.println(getMultiplicationFromThreeToNine2());
        System.out.println(getFactorial(3));
        System.out.println(getSumOfEvensBetweenTwoInteger(13, 7));


    }

    // 4) 7'den 70'e kadar tüm tamsayıların toplamını veren kodu yazınız
    public static int getSumFromSevenToSeventy(){
        return IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();
        // return IntStream.rangeClosed(7,70).reduce(Integer::sum).getAsInt(); böyle de yazabilirdik...Integer::sum ayni isi görüyor

    }
    //5)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.

    // 1.yol
    public static int getMultiplicationFromThreeToNine1(){
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();
        //reduce ele aldığımız coklu sayıları tek e indirmek icin ..
        /*IntStream bize genişş integer aralığını verir*/
    }

    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int  getFactorial(int x){
        if (x==0){
            return 1;
        }else if (x<0){
            System.out.println("Faktöriyel işlemi negatif sayılarla yapılamaz");
            return -1; //burada int return etmek zorunda oldugumuz icin -1 i seçtik..-1 'in özelligi yok,
        }else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt(); //opşınıl ı integer yapıyor
        }
    }
    // 7)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInteger(int a,int b){

        if (a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.
                range(a+1,b).
                filter(Utils::isNumberEven).
                sum();
    }

}
