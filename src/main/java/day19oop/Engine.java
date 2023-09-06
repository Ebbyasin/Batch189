package day19oop;

public interface Engine {
    void run();
    static void stop(){
        System.out.println("Stops securly");
    }
    int price=3000;
}
