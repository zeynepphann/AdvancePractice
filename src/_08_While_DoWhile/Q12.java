package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        String sonuc="";


        while (sayi>0){
                if (sayi%2==1){
                    sonuc=sonuc+(sayi+" ");
                    sayi--;
                }else
                    sayi--;

            }
        System.out.println(sonuc);

        }



    }

