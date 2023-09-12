package day22map_exception;

public class E01 {

    public static void main(String[] args) {

           /*
        Exception beklenmedik problem demektir.Java cozemedigi bir sorunla karşılaştiginda exception class
         i devreye girer.
        Exception class i bize karşılaşılan sorunun cinsini ve bu sorunun nereden kaynaklan
         digini ve sebebini bildirir.
        Java exception fırlattığında kodun çalışmasını durdurur,ve bizden bir
         karar vermemizi bekler.
        Kodumuzun çalışmaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel
         kodlarımızı try catch blogu içinde yazmalıyız

         Exception i handle edebilmek için iki temel yol vardir
            a)Exception için gereksinimlere göre (FRD) uygun çözümler üretebilirsiniz.Buna Exception
               handling denir.Bunu try catch kullanarak yapabiliriz,
              *Try block da yapılmasi gereken islemi javadan isteriz,java islemi problemsiz bir şekilde
              yaparsa catch block aktive olmaz
              *Try block da java yapılması istenen şeyi yaparken exception ile karşılaşırsa catch block
              devreye girer ve catch block içindeki kodlar calısır.
              *Try block da işlem yapılırken Exception oluşursa try block içindeki exception dan sonraki
              kodlar calıştırılamaz
            b)Exception olustugunda bunu ilan eder ve geri çekilirsiniz.Bunada Throw Exception denir
              tr



        ==>Yazdığımız kod çalışmadığında problemi bulmak icin loglara bakariz.
        */
        divide(12,3);
        divide(12,0);

        divide2(5,1);

    }

    //ArithmeticException yazdığınız code da matematiksel bir işlem kullaniyorsanız alinabilecek bir
    //Excetion  dir
    public static void divide2(int a,int b){
        try{
            System.out.println(a/b);
            System.out.println("try içi görev tamamlandı");

        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");

        }
        System.out.println("try-catch sonrasi görev tamamlandi");

    }

    //Kesinlikle tavsiye edilmez
    public static void divide(int a,int b) {

        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }
}
