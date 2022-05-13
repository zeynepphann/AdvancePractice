package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();

        int toplam=0;

        while (sayi!=0) {

            toplam+=sayi%10;
            sayi=sayi/10;
        }

        System.out.println(toplam);





    }

}
