package day24enum_iterator_lambda;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {

        //Enumdaki bir sabite nasil ulasabiliriz?

        Cities hatay = Cities.HATAY; //data type i Cities dir
        System.out.println(hatay);

        //Adana sabitinin ismine ulasalim
        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);

        //Ankara nin posta koduna ulasalim
        String ankaraPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostalCode);

        //İstanbulun plaka kodu
        System.out.println(Cities.İSTANBUL.getPlateCode());

        //Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Plaka kodunu giriniz..");
        int plaka = input.nextInt();

        //value() methodu enum icindeki tum datalari bir array icinde bize verir.Buyuk kolaylık
        Cities[] cities = Cities.values();
        //System.out.println(Arrays.toString(cities));

        if (plaka < 82 && plaka >0 ) {
            for (Cities w : cities) {     // burada  şöyle de olabilirdi:for(Cities w:Cities.values()) olabilirdi
                if (plaka == w.getPlateCode()) { //ADANA.getPlateCode oluyor
                    System.out.println("Girmiş oldugunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        } else System.out.println("Girmiş oldugunuz plaka gecersizdir");



    }
}
