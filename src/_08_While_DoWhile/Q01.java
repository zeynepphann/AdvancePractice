package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scanner.nextInt();
        armstrong(sayi);


    }

    private static void armstrong(int n) {
        int toplam=0;
        int basamakSayisi=0;
        int girilenSayi=n;

        while (n > 0) {

            basamakSayisi=n%10;
            toplam+=basamakSayisi*basamakSayisi*basamakSayisi;
            n=n/10;

        }
        if (girilenSayi==toplam){
            System.out.println("Armstrong");
        }else
            System.out.println("Degil");

    }

}
