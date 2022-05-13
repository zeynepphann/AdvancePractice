package JavaProjects.P11_depoYonetimi;

import java.util.HashMap;
import java.util.Scanner;

public class Islemler {
    static Scanner scanner=new Scanner(System.in);
    static int id=1000;

    static HashMap<Integer,Urunler>urunler=new HashMap<>();// urunleri depolamak icin bos map


    public static void girisPaneli(){
        System.out.println( "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  ");
        System.out.println("islem seciniz");
        int secim =scanner.nextInt();
        switch (secim){
            case 1:
                urunTanimla();
                girisPaneli();
                break;
                case 2:
                    girisPaneli();
                break;

                case 3:
                    girisPaneli();
                break;
                case 4:
                    girisPaneli();
                break;
                case 5:
                    urunListeleme();
                    girisPaneli();
                break;
                case 6:
                  cikiniz();
                break;


        }

    }

    private static void urunListeleme() {
        System.out.println("*** URUNLER ***");
    }

    private static void cikiniz() {
        System.out.println("cikis yapildi");
    }

    private static void urunTanimla() {
        System.out.println("urun ismini giriniz ");
        String urunIsmi=scanner.nextLine();
        scanner.next();
        System.out.println("uretici bilgisi giriniz ");
        String uretici=scanner.nextLine();
        scanner.next();
        System.out.println("urun birimi giriniz ");
        String birim=scanner.nextLine();
        System.out.println("urun miktari giriniz ");
        int miktar=scanner.nextInt();
        System.out.println("urun rafini giriniz ");
        String raf=scanner.nextLine();

        Urunler urun =new Urunler(id,urunIsmi,uretici,miktar,birim,raf);

        urunler.put(id,urun);
        System.out.println(id+ " : "+urunler.get(id));
        id++;

    }
}
