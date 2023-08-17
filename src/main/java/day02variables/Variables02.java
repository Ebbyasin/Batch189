package day02variables;

public class Variables02 {

    public static void main(String[] args) {
        //Ornek 9:Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String ogrenciAdi="Ali Can";
        System.out.println(ogrenciAdi);

        //her class bir non-primitive dir.class isimleri buyuk harfle baslar,String
        //buyuk harfle baslar..
        /*
        primitive datalarda decleration(deklereysin)yapildiginda memoryde olusan
        kavanoza 0 degeri atar,non-primitive datalarda ise null degerini atar.
        NULL 0(sifir) degildir,null hiclik demektir,sifir da codingte
        bir degerdir,null
        degildir,hiclik demektir,ici bos obje demektir ayni zamanda.
        Yani primitivelerin default degeri 0,non-primitivelerde null dir..
         */



        int age=13;

        /*
        primitive ve non-primitive ler arasindaki farklar nelerdir:

        1)primitive ler sadece bizim atadigimiz degeri icerir.
        non-primitive ler bizim atadigimiz deger ve method'lar icerir.

        2)primitive ler kucuk harfle baslar,
          non-primitiveler buyuk harfle baslar

        3)primitive leri java uretmistir ve 8 tanedir
          non-primitive leri hem java hem de programcilarda uretebilir
          dolayisiyla sinirsiz sayidadir.

        4)primitive ler memory de data type larina gore sabit boyutta bellek
        kullanirlar,
          non-primitive ler icin java memory de buyuklugune gore degisen boyut
          larda bellek kullanabilirler.
         */

        //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini
        // ekrana yazdirin

        //1.yol
        byte note1=70;
        byte note2=90;


        System.out.println(note1+note2);

        //2.yol

    }
}
