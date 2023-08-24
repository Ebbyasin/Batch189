package day12arrayLists;

public class MethodCreation01 {

    public static void main(String[] args) {

        /*
        Java da method nasil olusturulur?
        ==>main methodun disinda classin icinde olusturulur
        1)Acces Modifier + return type + Method ismi + () + {}
        2)Method olusturmak methodu calistirmak icin yeterli degildir

         */
        //Method call:main method icinde bir method kullanilmasina method call denir
        int sonuc=toplamaYap(13,12);
        System.out.println(sonuc);

    }
    //ornek 1 :toplama islemi yapan bir method olusturunuz

    public static int toplamaYap(int a,int b){

        return a+b;
    }



}
