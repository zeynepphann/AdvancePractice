package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Kayit yeniKayit=new Kayit();// obj ile method call yapacagiz


        List<Kullanici> kisi = new ArrayList<>(); //bos list
        boolean cikilsinMi= false;
        while (!cikilsinMi){
            System.out.println("lutfen \n1: kayit al\n2: sansli kisi bul \n3: kisileri listele \n4 cikis" );
            System.out.println("isleminizi seciniz: ");
            int islem= scan.nextInt();
            switch (islem){
                case 1:
                    kisi=yeniKayit.kayitAl();// kisi list'i degerini  yeniKayit obj ile kayitAl method call dan alacak
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi); // obje methodu cagir calsitir sanslikullaniciyi bul
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;

                default:
                    System.out.println("hatali veri girdiniz ");
                    break;



            }

        }

    }
}
