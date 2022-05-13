package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        int toplam=1;

        do {
            for (int i = 1; i <sayi ; i++) {

                toplam+=toplam*i;

            }

        }while (sayi==1);
        System.out.print("toplam="+toplam);

    }
}


