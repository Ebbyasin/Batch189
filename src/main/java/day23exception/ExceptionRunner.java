package day23exception;

public class ExceptionRunner {

    public static void main(String[] args) {

        /*
    Exception lar disinda Error diye adlandirdigimiz ve handle edilemeyen bazi problemler vardir
     mesela application larda Memory nin dolmasi bir errordur
        iki tur memory error vardir:
        a) Stack memory dolarsa "StackOverFlow Error" alirsiniz
        b) Heap memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden once sileceği datalari "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()

        final:“final” bir keyword’tür. Variable, class ve methodlar için kullanılır.
        bir class final sa inherit edilemiyor,cocugu olmuyor,artik constant oluyor ,sabitleniyor
        final methodlar override edilemiyor

        finally:“finally” bir code blocktur. try-catch veya sadece try ile kullanılır.
        finally her halukarda ,try catch in sonucu ne olursa olsun calısırdı,dolabın kapisini kapat
        mak gibi,database le connectionu kesmek gibi...


         */






       //   getStudentGrade(77);
       //   getStudentGrade(-77);
       //   getStudentGrade(777);
       //   System.out.println("main method");

        getTheNumberOfStudents(15);
        getTheNumberOfStudents(-15);

    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            throw new InvalidNumberException("Student number cannot be negative");
        }else {
            System.out.println(numOfStudents);
        }

    }

    public static void getStudentGrade(int grade){
        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(grade);
        }

        System.out.println(grade);
    }
}
