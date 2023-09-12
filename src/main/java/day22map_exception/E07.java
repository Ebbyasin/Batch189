package day22map_exception;

public class E07 {

    public static void main(String[] args) {
         printAge(63);
         printAge(-5);




    }

    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");//kendi exception objemizi
                              //olusturup fırlattık.IllegalArgumentException() bir constructor dur
        }else {
            System.out.println(age);
        }




    }
}
