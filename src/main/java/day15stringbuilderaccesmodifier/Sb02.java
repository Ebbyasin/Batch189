package day15stringbuilderaccesmodifier;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java is easy");

        System.out.println(sb1);// Java is easy
        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ
        //verilen indexteki karakteri siler
        sb1.deleteCharAt(0);
        System.out.println(sb1);
        //baslangic index dahil bitis index(haric) ine kadar olan characterleri sil
        sb1.delete(0,3);
        System.out.println(sb1);
        //replace(0,2,"xxx"); 0 dahil 2 haric olmak uzere bu indexlere x koyar
        sb1.replace(0,2,"xxxxxxxxx");
        System.out.println(sb1);

        sb1.insert(2,"777"); // bastan 2 deger say atla ondan sonra 777 yi koy
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Java");

    }
}
