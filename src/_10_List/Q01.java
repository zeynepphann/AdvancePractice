package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         * remove silmek
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        /*List<String> isimler= new ArrayList<>();

        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Fatma");
        isimler.add("Ayse");
        isimler.add("Omer");

        for (int i = 0; i <isimler.size(); i++) {

        }

         */

          List<String> isim= new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
          List<String> aOlmayanisimler= new ArrayList<String>();
        for (String w : isim) {
            if(!w.toLowerCase().contains("a")){ // a bulunmuyor
                aOlmayanisimler.add(w);
            }

        }
        System.out.println("a olmayan isimler : "+ aOlmayanisimler);
        isim.clear();
        isim.addAll(aOlmayanisimler);
        System.out.println(isim);











        /*
        String arr[]={"Ali","Veli","Ayse","Fatma","Omer"};
        List<String>list1=new ArrayList<>();
        for (String each:arr
             ) {
            list1.add(each);
        }
        System.out.println(list1);


        for (int i = 0; i <list1.size() ; i++) {
                list1.get(i);
            for (int j = 0; j <list1.get(i).length(); j++) {
                    if (list1.get(i).toLowerCase().contains("a")){
                        list1.remove(i);
                    }
            }

        }
        System.out.println("'a' harfi icermeyen isimler : " + list1);
         */



    }
}
