package _17_Set;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */


    public static void main(String[] args) {
        ArrayList<Integer>arrList1=new ArrayList<>();
        ArrayList<Integer>arrList2=new ArrayList<>();

        arrList1=arrListHazirla(10,0,20);// 10 tane sayiyi 0 ile 20 arasinda olustur
        arrList2=arrListHazirla(5,0,20); // 5 tane sayiyi 0 ile 20 arasinda olustur
        System.out.println("10 elemanli :"+ arrList1);
        System.out.println("5 elemanli : "+ arrList2);
        // ortak eleman bulma arrList1.retainAll(arrList2);
        // ortak eleman bulma System.out.println("ortak elemanli list : " + arrList1);

        ArrayList<Integer> arayListFark1 = new ArrayList<>(arrList1);//list1 de olup list2 de olmayanlat ->list1-list2
        ArrayList<Integer> arayListFark2 = new ArrayList<>(arrList2);//list2 de olup list1 de olmayanlat ->list2-list1

        arayListFark1.removeAll(arrList2);// list1 den list2 cikarilarak list1 de olup list2 de olmayan yani farkli elemanlarin oldugu list create edildi
       System.out.println("farkli list1 : " + arrList1);
       arayListFark2.removeAll(arrList1); //list2 den list1 cikarilarak list2 de olup list1 de olmayan yani farkli elemanlarin oldugu list create edildi
       System.out.println("farkli list2 : "+ arrList2);

        arayListFark2.addAll(arayListFark1);//fark list'leri ekledi
        Collections.sort(arayListFark2);//k->b
        Collections.reverse(arayListFark2);// b->k
    }
    public static int getRandomInt(int min, int max){ // bu method max ile min arasi sayi return eder
        return (int) (Math.random()*(max-min+1));
    }

    private static ArrayList<Integer> arrListHazirla(int size, int min, int max) {  // int sayi gelenleri uzunluk ve max min duzenledik
        ArrayList<Integer>bosList=new ArrayList<Integer>();
        for (int i = 0; i <size ; i++) {
            bosList.add(getRandomInt(min,max));
        }
        return bosList;
    }
}
