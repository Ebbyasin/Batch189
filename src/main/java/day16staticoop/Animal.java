package day16staticoop;

public class Animal {
    /*
    * OOP conceptin 4 tane prensibi vardir
    * 1)Inheritance
    * 2)Polymorphism
    * 3)Encapsulation
    * 4)Abstraction

    * 1)Inheritance(ev yapacaz cimento lazim,gidip cimento fabrikasi acmayiz,bir yerden aliriz)
       Ozellikleri bir classtan diger classlara Alan bir kavramdir,bunun javadaki karsiligi şudur:
       * siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz
         ozelliklerin bircogunu kapsiyor o zaman yeni olusturdugunuz class in ozelliklerini
         kullanmak istediginiz class a child yapmalisiniz
         *
         * ******parent--->>super*****super baba yani,super deyince akla parent gelir*****

         1) Inheritance in faydalari
           a)Code tekrarlarindan kurtuluruz
           b)Code tamiri(maintenance) kolay olur
           c)Chilt calss lari daha atomic yapmis oluruz
         2)Bir class i baska bir classin child classi yapmak icin extends keyword kullanilir
         3)Child class objectleri Parent Class dan method ve variable lari kullanabilirler
         4)Parent class objectleri child class dan method ve variable lari kullanamazlar
         5)Javada bir class in sadece bir tane parenti olabilir,java çoklu parenti(==>Multiple inheritance)desteklemez
           tekli parent i ( single inheritance) destekler,java single inheritance kullanir
         6)Apartman seklindeki inheritance yapisina Multilevel inheritance denir,java Multilevel inhertance i destekler
         7)Object class her class in parentidir,java da object class haric her class in parentidir
         8)Javada parent tan child e olan iliskilere HAS-A Relationship denir
           Javada child dan parent a olan iliskilere de IS-A Relationship denir.
         9)java da her class in bir tane default constructor i vardir.Bu default constructor
           class icindi gorunmez cunku default constructor Object class icindedir.
     */

    public void eat(){
        System.out.println("Animals eat..");
    }
    public void drink() {
        System.out.println("Animals drink..");
    }
}
