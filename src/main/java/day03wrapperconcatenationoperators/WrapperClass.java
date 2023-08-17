package day03wrapperconcatenationoperators;

public class WrapperClass {

    public static void main (String[] args){

        //java ,primitive data type lara bazi faydali methodlar ekleyerek yeni bir veri yapisi
        //olusturmustur.Bu yeni "WrapperClass" olarak adlandirilir.

        // primitive     :  char    -boolean  -byte  -short   -int   -long  -float  -double
        // Wrapper Class :Character -Boolean  -Byte  -Short -Integer -Long  -Float  -Double

        int n =12;

        Integer m=12;

        //m. yazdigimizda bir sürü method cikar otomatik olarak,bu Wrapper dir
        //n. yazdigimizda method cikmaz,cunku primitive dir.

        //unboxing :Wrapper i primitive haline cevirmek,kutu dişina tasimak(burada kutu=Wrapper)
        //AutoBoxing : primitive halini Wrapper a cevirmek.

        /*
        *********NEDEN WRAPPER CLASS KULLANİRİZ,NE İŞE YARAR?SOR ÖĞREN******
         */

        //Ornek : Primitive int i wrapper Integer a ceviriniz

        int num = 13;
        Integer wrapperNum = num; // bu işlem AutoBoxing dir
        System.out.println(wrapperNum);

        // Ornek:Wrapper Byte i primitive byte a ceviriniz

        Byte k=19;
        byte primitiveK=k;  //bu işlem UnBoxing dir.
        System.out.println(primitiveK);



    }
}
