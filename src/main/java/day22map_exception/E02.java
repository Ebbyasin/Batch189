package day22map_exception;

public class E02 {
    public static void main(String[] args) {
        String s="1234a";

        convertStringToInt(s);


    }
    //Icinde rakamlar dışında character olan bir stringi sayiya cevirmek isterseniz java NumberFormatException
    // atar..,
    public static void convertStringToInt(String s){
        try {
            int intS=Integer.valueOf(s); //"1234a" buraya gonderilince burda NumberFormatException hatasi verir,catc e atlar
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir Stringin sayiya cevrilebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }

    }
}
