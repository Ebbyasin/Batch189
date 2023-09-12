package day21maps;

import java.util.*;

public class Maps01 {

    public static void main(String[] args) {

                /*
               (tekrarsiz)       (tekrarli)
                KEY          =     VALUE
    entry                                     entryset
                Cat          =     Kedi       "cat=kedi" ifadeleri beraber entry dir
                Dog          =     Köpek      sol tarafın tamamı entryset tir
                Hard         =     Zor
                Difficult    =     ZoR

                  KEY                 VALUE
        (tekrarsiz          (tekrarli
        unique)             olabilir)

        Cat             =    Kedi  | ( Cat = Kedi bir "entry" dir)
        Dog             =    Kopek |===> entry set( map in tum elemanlari)
        Hard            =    Zor   |
        Difficult       =    Zor   |
        (String)            (String) ==> Data tipleri farkli olabilir

          1)Map lerde sözlüklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
          2)key kısmı tekrarsız,value kısmı tekrarlı olabilir
          3)Map ler deki her bir elemana entry denir,tamamına ise EntrySet denir
          4)Entry ler tekrarsız olduğu için entry set denilir
          5)Key ve value eler ayrı ayrı data type larında olabilirler.
          6)Map ler collection değildir, farklı yapıdır.
          7)HashMap ler entry leri rastgele sıralar,bu yüzden en hızlı map dir..

        */


       // Map nasıl oluşturulur?
        HashMap<String,Integer> countryPopulation=new HashMap<>();

        //Map e entry nasıl eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Italy",40000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation);

       // get() methodu key ile çalışır ve value kısmını verir.
        Integer turkiyePopulation=countryPopulation.get("Turkiye");
        System.out.println(turkiyePopulation);

        //Bütün key leri nasıl alabiliriM?
        Set<String> keys=countryPopulation.keySet();
        System.out.println(keys);

        //Bütün value leri nasıl alabilirim?
        Collection<Integer> values=countryPopulation.values();
        System.out.println(values);

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalaması nedir?
        int sum=0;
        for (Integer w:values) {
            sum+=w;
        }
        System.out.println(sum / values.size());

        //entrySet() methodu mapteki entry leri kalıp halinde alip Setin içine koyarak verir
        //loop lar map ler ile kullanilamaz,bunun için entryset methodunu kullanarak map in key value
        //olan entry lerini bir setin içine koyarız

        Set< Map.Entry<String,Integer> > entries=countryPopulation.entrySet();
        System.out.println(entries); //[Turkiye=83000000, Netherland=18000000, USA=400000000, Italy=40000000, Germany=83000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int toplam=0;
        for (Map.Entry<String,Integer>  w : entries) {
             toplam=toplam+w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);






    }
}
