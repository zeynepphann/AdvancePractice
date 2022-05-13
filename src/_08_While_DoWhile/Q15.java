package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int sayi1faktoriel=1;
        int sayi2faktoriel=1;
        int ortakfaktoriel=1;



        do {
            for (int i = 0; i <sayi1 ; i++) {
                sayi1faktoriel+=sayi1faktoriel*i;
            }
            for (int i = 0; i <sayi2 ; i++) {
                sayi2faktoriel+=sayi2faktoriel*i;
            }

            for (int i = 0; i <sayi1-sayi2 ; i++) {
                ortakfaktoriel+=ortakfaktoriel*i;
            }

        }while (sayi1==1);

        //   n! / (r!(n-r)!)

        int sonuc=sayi1faktoriel/(sayi2faktoriel*ortakfaktoriel);
        System.out.println(sonuc);

        /*
         Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen kombinasyonlarının hesaplanmasını istediğiniz iki sayiyi giriniz. C(n,r)\nn:");
        int n = scan.nextInt();
        System.out.print("r:");
        int r = scan.nextInt();
        kombinasyon(n, r);
    }
    private static void kombinasyon(int n, int r) {
        int nfaktoriyel = 1;
        int rfaktoriyel = 1;
        int farkfaktoriyel = 1;
        int fark = n - r;
        if (r > n) System.out.println("r değeri n değerinden büyük olamaz.");
        else {
            if (n==0) nfaktoriyel=nfaktoriyel;
            else {
                while (n >= 1) {
                    nfaktoriyel *= n;
                    n--;
                }
            }if(r==0) rfaktoriyel=rfaktoriyel;
            else {
                while (r >= 1) {
                    rfaktoriyel *= r;
                    r--;
                }
            }if (fark==0) farkfaktoriyel=farkfaktoriyel;
            else {
                while (fark >= 1) {
                    farkfaktoriyel *= fark;
                    (fark)--;
                }
            }
            System.out.println("Kombinasyon: "+nfaktoriyel/(rfaktoriyel*farkfaktoriyel));
        }
         */



    }
}

