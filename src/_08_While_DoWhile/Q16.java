package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pin kodu giriniz 3 giris hakkiniz vardir");
        int pinKodu=246789;
        int girisHakki=3;

        do {
            int kullaniciPin= scanner.nextInt();

            if (kullaniciPin==pinKodu){
                System.out.println("giris yaptiniz");
                break;
            }else
                System.out.println("hatali giris yaptiniz tekrar giris yapiniz ");
                girisHakki--;
                System.out.println(girisHakki+ " hakkiniz kaldi");
                if (girisHakki==0){
                    System.out.println("giris hakkiniz bitti");
                }

        }while (girisHakki!=0);

    }
}
