package day04scannerincrementdecrementifstatements;

public class IncrementDecrement {

    public static void main(String [] args){

        //Increment :
        int a=5;
        System.out.println(a);

        a=a + 2; //7
        System.out.println(a);

        // java ustteki gibi a larin surekli tekrarlanmasini onlemek icin
        // yeni bir syntex gelistirmis a=a + 2; yazmak yerine a+=2; yazariz

        a +=2; //9
        System.out.println(a);

        //Decrement
        int c=8;
        System.out.println(c);

        c=c-3;//5
        System.out.println(c);

        c-=3;
        System.out.println(c);//2

        //Increment 2

        int d=6;
        System.out.println(d);

        d=d*2;
        System.out.println(d);//12

        d*=2;
        System.out.println(d);//24

        //decrement 2
        int e=24;
        System.out.println(e);

        e=e/2;
        System.out.println(e);//12

        e/=2;
        System.out.println(e);//6

        // 1 ile increment
        int f =13;

        f =f+1;
        System.out.println(f);//14

        f+=1;
        System.out.println(f);//15

        f++;  // 1 arttirildiginda her zaman bu sonuncu syntax kullanilmali***
        System.out.println(f);//16

        //1 ile decrement
        int h=9;

        h=h-1;
        System.out.println(h);

        h-=1;
        System.out.println(h);

        h--;//***
        System.out.println(h);

        //post-increment / pre-increment***********

        int i=10;
        int k=i++; // java soldan saga calistigi icin once k adinda bir depo olusturuyor,sonra
        // bu satirda atamadan (=) dan sonra ilk
        // variable i geldigi icin 'i' variable sini 'k' ya atiyor sonra 'i' yi 1 arttiriyor

        System.out.println(k);//10--> i arttirilmadan k ya konuldgu icin k nin degeri 10 olur
        System.out.println(i);//11 --> i arttirildigi icin zaten 11 olur

        int m=15;
        int n=++m;// yine java soldan calismaya baslar,n adinda bir kavanoz olusturur,atamadan
        // yani esittirden sonra ++ yi gorunce birsey yapamaz m yi arttirir,sonra n ye atar
        System.out.println(n);//16
        System.out.println(m);//16

        int p=17;
        int r=p--;

        System.out.println(r);//17
        System.out.println(p);//16

        int s=20;
        int t=--s;

        System.out.println(s);//19
        System.out.println(t);//19


    }
}
