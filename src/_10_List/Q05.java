package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        tekSayiyazdir();
    }

    private static void tekSayiyazdir() {

        List<Integer > tekSayi= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 6 eleman giriniz");


        for (int i = 0; i < 6 ; i++) {
            System.out.println((i + 1) + ".sayi :");
            int sayi = scan.nextInt();

            if (sayi % 2 != 0) {
                tekSayi.add(sayi);
            }
        }
        System.out.println(tekSayi);
    }


}
