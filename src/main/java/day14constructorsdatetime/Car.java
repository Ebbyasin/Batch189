package day14constructorsdatetime;

public class Car {

    /*
    Conctuctor nedir?
    classdan object(obje) uretmemize yarayan code blocklaridir.Yoksa olusturamayiz.
    class olusturdugumuzda java bize otomatik olarak bir constructor verir
    ama bu constructor gözle görülmez,gözle görülmeyen otomatik olarak java tarafindan
    bu constructor lara "default constructor"denir

    Siz kendi constructor inizi olusturduguzda java default cons. u siler.
    default constructor ===>>> Car () { } boyle birseydir.

    Bir classda farkli parametreler kullanarak istedigimiz kadar constructor olusturabiliriz
    farkli constructorlar sayesinde bir classtan farkli farkli objectler olusturabiliriz

    Constructor nasil olusturulur?
    Access modifier + class ismi + () + {}

    interwiew sorusu

    Methodlar ile constructorlar arasindaki fark nedir?
    1)Methodlar return type olur,Constructor larda olmaz
    2)Methodlar yaptiklari işe göre isimlendirilirler,Constructorlar ise her zaman class ismi
    ile isimlendirilirler
    3)Methodlar bir aksiyon yapmak icin olusturulurlar,Constructorlar ise object olusturmak
    içindir.
    4)mothod isimleri kucuk harfle baslar,Constructor isimleri class ismi ile ayni oldugu
    icin buyuk harfle baslar

    Parametreli constructorlar olusturarak ayni classdan farkli ozelliklere sahip objectler
    olusturabiliriz



    */

//    Variable lar olusturalim

    String make="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid=true;

    public Car(String make, String model, int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;


    }
    Car(){

    }

    public Car(String make,String model){
        this.make=make;
        this.model=model;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(int year) {
        this.year = year;
    }

    //method olusturalim

    public void hareket(){
        System.out.println("Honda hızlı hareket eder");
    }
    public void dur(){
        System.out.println("Honda guvenli bir şekilde durur ");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
