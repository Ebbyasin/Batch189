package day14constructorsdatetime;

public class CarRunner {

    public static void main(String[]args){

        Car c1=new Car("BMW","M4",2023,false);
        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.hareket();
        c1.dur();

        Car c2=new Car("Audi","R8",2022,true);
        Car c3=new Car("Honda","Civic",2015,false);

        System.out.println(c1);// toString olusturmasaydik Car classinda bunlar referans olar
        System.out.println(c2);//olarak yazacakti
        System.out.println(c3);

        Car c4=new Car("Mercedes","A180");


    }
}
