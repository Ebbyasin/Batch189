package day17oop;

public class Cat extends Animal{

    @Override //override gecersiz kilmak demektir
    public void eat() {
        System.out.println("Cats eat");
    }

    public void meow(){
        System.out.println("Cats meow..");

    }
    @Override//override annotation : override kurallarini java tarafindan
             // kontrol edilmesini sagliyor
    public void drink() {
        System.out.println("Cats drink");
    }
}
