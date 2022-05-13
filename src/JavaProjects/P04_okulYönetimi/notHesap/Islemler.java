package JavaProjects.P04_okulYönetimi.notHesap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    //butun methodlar burada


    static List<Kisi> ogrenciListesi=new ArrayList<>();
    static ArrayList<Kisi> ogretmenListesi=new ArrayList<>();
    static Scanner scan =new Scanner(System.in);
    static String kisiTuru; //ogrenci mi ogretmen mi onu seciyoruz

    public static void girisPaneli(){
        System.out.println("====================================\n" +
                " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "====================================\n" +
                " 1- ÖĞRENCİ İŞLEMLERİ\n" +
                " 2- ÖĞRETMEN İŞLEMLERİ\n" +
                " Q- ÇIKIŞ");

        System.out.println("isleminizi seciniz : ");
        String secim=scan.next().toUpperCase();
        switch (secim){
            case "1":
                kisiTuru="OGRENCI";
                islemMenusu();
                break;

            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;

            case "Q":
                cikis();
                break;

            default:
                System.out.println("hatali giris yaptiniz : ");
                girisPaneli();// method call var yani kullanici yanlis girerse tekrar
                              // giris paneline yonlendirecek YANI RECURSIVE

                break;
        }

    }

    private static void cikis() {
        System.out.println("cikis yaptiniz...");
    }

    public static void islemMenusu(){
        System.out.println("============= İŞLEMLER =============\n" +
                " 1-EKLEME\n" +
                " 2-ARAMA\n" +
                " 3-LİSTELEME\n" +
                " 4-SİLME\n" +
                " 0-ANA MENÜ\n"
                );
        System.out.println("islem tercihinizi seciniz");
        int secilenIslem=scan.nextInt();

        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:
                islemMenusu();
                break;
            case 4:
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;

            default:
                System.out.println("gecerli bir sayi giriniz");
                islemMenusu();
                break;
        }


    }

    private static void ekle() { //buranin public yada privete olmasinin onemi yok cunku
                                 // baska bir package da kullanmiyoruz cunkun


        System.out.println("        ****      "+kisiTuru+   "ekleme sayfasi       ****"  );
        System.out.println("ad soyad giriniz : ");// BURALAR ORTAK
        scan.nextLine();// dummy hayalet komut cunku ad soyad istiyor
                        // ve ikisi birlikte yaziliyor o yuzden
        String adSoyad=scan.nextLine();            // BURALAR ORTAK
        System.out.println("kimlik no giriniz : ");// BURALAR ORTAK
        String kimlikNo=scan.nextLine();           // BURALAR ORTAK
        System.out.println("yas giriniz : ");      // BURALAR ORTAK
        int yas=scan.nextInt();
        if (kisiTuru.equals("OGRENCI")){
            System.out.println("ogrenci no  giriniz : ");
            String ogrcNo=scan.nextLine();
            System.out.println("sinif giriniz : ");
            String sinif=scan.nextLine();
            Ogrenci sefilOgrenci= new Ogrenci(adSoyad,kimlikNo,yas,ogrcNo,sinif); // parametreli cons'tan ogrenci objesi create edecek
            ogrenciListesi.add(sefilOgrenci);

        }else {
            System.out.println("sicil no giriniz : ");
            String sicilNo=scan.nextLine();
            System.out.println("bolum giriniz : ");
            String bolum=scan.nextLine();
        }
    }

}
