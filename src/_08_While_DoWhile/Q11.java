package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false
 Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi=scanner.nextInt();

        boolean flag=true;

        do {
            for (int i = 0; i <sayi ; i++) {

                if (sayi==i*i){
                    System.out.println("tam kare ");
                    flag=true;
                }else
                    System.out.println("tam kare degil ");
            }

        }while (flag==false);



         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi = scan.nextInt();
        int sayac=1;
        boolean kontrol=false;
        while (sayac * sayac <= sayi) {

            if (sayac * sayac == sayi) kontrol=true;
            sayac++;
        }
        System.out.println(kontrol);

    }
}
