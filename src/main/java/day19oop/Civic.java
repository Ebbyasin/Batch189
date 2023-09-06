package day19oop;

public class Civic implements Ac,Security,Engine{


    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }
     public void run(){
        System.out.println("Ac runs super");
    }
}
