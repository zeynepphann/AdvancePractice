package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scanner=new Scanner(System.in);
        int giris =5;
        int max=0;


        while (giris>0){

            System.out.println("Lutfen 1 adet sayi giriniz");

            int sayi=scanner.nextInt();
            if (sayi>max) {
                max = sayi;
            }
            giris--;
        }
        System.out.println(max);

     
        }


    }



