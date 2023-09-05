package day18oop;

public class Animal {
    /*
    OVERRİDİNG
    1)Parent class daki methodu child class icinde özelleştirerek kullanmaya overriding yapmak
    deniliyor
    2)Overriding de methodur parantezine,methodun ismine dokunulmaz,yani methodun signature si de
    degistirilemez,methodun body si degisir.
    3)Child class taki override eden eat() methoduna Overriding methodu denilir,parent class taki
    override edilmis eat() methoduna Overriden methodu denilir
    4)Birşeye ihtiyaç duydugumda önce kendi evime bakarim,yoksa babamin evine bakarim(parent),yoksa
    onun parent ina bakarim
    5)private methodlar override edilemezler
    6)Child class daki methodun access modifieri parent class daki override edilmis (overriden)
    methodun access modifier inden dar olamaz.Aynisi olabilir,ya da daha geniş olabilir.

    Overriden Method==>protected ise --Overriding Method ==> protected + public
    Overriden Method==>default ise --Overriding Method ==> default + protected + public
    Overriden Method==>PRİVATE  ise --Overriding Method ==> OVERRİDE OLMAZ Kİ access modifieri olsun
    (Bakınız 4.kural

    6)Child class ta override edilen methodun return type i ile Parent class taki methodun
    return type i arasinda "IS-A" ilişkisi varsa return type degistirilebilir.

    7)Methodun return type i primitive ise Overriding yaparken return type degistirilemez
    Çünkü return type ya ayni olur ya da parent tan secilir.Primitive ler arasinda parent-
    child ilişkisi olmadiğindan parent tan seçmek söz konusu olamaz ve geriye tek seçenek
    kalır o da aynı olmak.

    8)Child da override edilen methodun return type i ile parent taki methodun return type i arasin
    da IS-A iliskisi yoksa return type degistirilemez, java bir wrapper classı;diğerinin child i
    yapmadigindan wrapper class larda return type degistirilemez."DURUN SİZ KARDEŞSİNİZ"Onlar
    Number class inin childleridir..yani onlar kardeştir

    9)Methodun return type i void ise Overriding yaparken type degistirilemez,yani void ise yine
    void olarak kalmak zorundadir.

    OVERRİDİNG YAPILIRKEN SİGNATURE YE DOKUNULAMAZ.
    ACCESS MODİFİER BELLİ KISTASLARA BAGLIDIR.(KAPSAMA ALANI)
    DATA TYPE LER DA İSE "IS-A" VE "HAS-A" İLİSKİSİNE BAKILIR
    WRAPPER CLASS LARDA CLASS TIR AMA PARENT CHİLD İLİŞKİSİ OLMADİĞİ İCİN OLMAZ

    10)static methodlar override edilemezler,Çünkü static methodlar tum childlar icin ortak
    methoddur.Bir child ortak methodu degistirdiginde diğer child lar bundan olumsuz etkilenebilir
    java static methodlarin override edilmesine musade etmez.

    11)Final methodlar override edilemez,final methodlarin body si degistirilemez ama override
    ederken method bady i degistiririz,bu bir celisti oldugundan java final methodlarin override
    edilmesine musade etmez
       a)final keywordunu variable lar ile kullanabilirsiniz
          i) final variable larda mutlaka deger atanmalidir
          ii)ilk atanan deger degistirilemez
       b)final keywordunu Methodlar ile kullanabilirsiniz
          i)method final ise methodun body si degistirilemez
          ii)method body degistirilemeyince override yapmak mümkün olmaz

       c)final keywordunu class lar ile kullanabilirsiniz
          i)class final ise o class in childi olamaz.

    12) Polymorphism = Method Overriding + Method Overloading

    */
    public Animal create(){
        return new Animal();
    }


    public void eat(){
        final  double pi=3.14;
        System.out.println("Animals eat");
    }

    public void drink(){
        System.out.println("Animals drink");
    }
    public int add(int a,int b){
        return a+b;
    }
    public Integer multiply(Integer a ,Integer b){
        return a*b;
    }
    public final double circleArea(double r){
        return 3.14*r*r;
    }

}
