package day19oop;

public class Accord implements Ac,Security,Engine {
    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }
   public void run(){
       System.out.println("Engine runs super");
    }
}
