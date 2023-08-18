package day08loops;

public class ForLoop03 {

    public static void main(String[] args) {
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20
        /*
        UZUN YOL
        int sayi=578;
        int sayi1=sayi%10;
        int araSayi=sayi/10;
        int sayi2=araSayi%10;
        int sayi3=araSayi/10;

        System.out.println((sayi1+sayi2+sayi3));

         */


        int sum=0;
        for (int i=578; i>0 ; i=i/10){

            sum=sum+i%10;

        }
        System.out.println(sum);
        System.out.println();

        // Example 1=Bir string teki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        String t="mehmet";
        String unique="";

        for (int i= 0; i<t.length() ; i++){
            char ch=t.charAt(i); // burada ch variable ina atayarak asagidaki karsilastirma isini kolaylastirdik.
            // alt tarafi alirken indexOf ve lastIndexOf u i olarak almak zorunda kalmamak icin,o zaman cozum olmuyor

            if (t.indexOf(ch)==t.lastIndexOf(ch)){
                unique=unique+ch;

            }
        }
        System.out.println(unique);

        //Example 2: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

        int total=0;

        for (int i=5; i<9; i++){
            total=total+i;
        }

        System.out.println(total);

        //Example 3
        //Example 2: 7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //           7*8*9 ==> 504

        int multiply=1;

        for (int i=7; i<10; i++){

            multiply=multiply*i;
        }
        System.out.println(multiply);




    }
}
