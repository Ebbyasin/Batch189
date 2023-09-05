package day18oop;

public class Cat extends Animal {

    @Override //(override annotation)override gecersiz kilmak demektir,override kurallarini takip eder
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

    @Override
    public Animal create() { // her class ürettigi objenin kalip ve data type idir.
        return new Cat(); // Cat() arada is a relation ship varsa sorun olmaz.
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }

}

