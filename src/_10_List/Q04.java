package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen  kac adet not gireceginizi yaziniz : ");
        int notAdedi=scan.nextInt();

        List<Integer> list=new ArrayList<>();
        System.out.println("lutfen  notlari giriniz: ");

        for (int i = 0; i < notAdedi; i++) {
            System.out.print((i+1)+". not : ");
            list.add(scan.nextInt());
        }

        double toplam=0;

        for (int i = 0; i < list.size() ; i++) {
            toplam+= list.get(i);

        }
        double ortalama= toplam/ list.size();
        System.out.println("Not ortalamasi : "+ ortalama);

        int sayac=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>ortalama){
                sayac++;
            }
        }

        System.out.println("Ortalamayı gecen ogrenci adedi : "+sayac);



    }
}
