package day07stringmanipulations;

public class StringManipulation03 {

    public static void main(String [] args){

        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht
        //lastIndexOf() parantezi icine yazilan karakterin string deki son gorunumunun indexini verir
        //indexOf("m") m nin ilk gorunumunun indexini verir

        // indexOf("m")     ==>  0  farkli tekrarli
        // lastIndexOf("m") ==>  3

        // indexOf("e")     ==>  1
        // lastIndexOf("e") ==>  4

        // indexOf("h")     ==>  2  ayni  tekrarsiz
        // lastIndexOf("h") ==>  2

        String s="mehmet";

        if (s.indexOf("m") == s.lastIndexOf("m")){
            System.out.print("m");
        }
        if (s.indexOf("e") == s.lastIndexOf("e")){
            System.out.print("e");
        }
        if (s.indexOf("h") == s.lastIndexOf("h")){
            System.out.print("h");
        }
        if (s.indexOf("t") == s.lastIndexOf("t")){
            System.out.print("t");
        }

        System.out.println();// yukarda print kullandigimiz icin cursor imlecin saginda kalmis
        // vaziyette,bos bir sout yapinca cursoru asagiya attik


        //*************

        //Example 1: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNum="1234 6789 1234 6789";
        String first=cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first);//**** **** ****

        String last=cardNum.substring(15);//son 4 rakami almak icin boyle yaptik,baslangic indexini
        // vermek yetiyor..
        System.out.println(last);//6789

        String result1= first+last;
        System.out.println("result1 = " + result1);//result1 = **** **** **** 6789

        //2.yol daha şık olan ,yeni bir locik ,daha rüyzıbıl
        String result2=first.concat(last);//first yazdigimiz anda string olmak zorunda
        System.out.println(result2); //concat meselesini tekrar bak.calis********
        //shift + f10


    }
}
