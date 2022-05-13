package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

      List<Kullanici> kisiler= new ArrayList<>();// bos list create edildi . kayital() method bu liste element atayacak


      public List<Kullanici> kayitAl(){ // kayit al methodu listi dondurecek
          Scanner scan= new Scanner(System.in);
          System.out.println("adinizi giriniz:");
          String isim= scan.nextLine();
          Kullanici k1=new Kullanici(isim, LocalDateTime.now()); //Kullanici classtan parametreli cons ile obj create ettik
          kisiler.add(k1); //kullaniciyi kisilere ekledik /Kullanici classtan parametreli cons ile obj kisiler listesine eklendi



          return kisiler;


      }

      public void sansliKullanici(List<Kullanici> kll ){
          for (Kullanici k:kll
               ) { // kayital methodundan create edilen her bir kullanici donguye sokuldu
              if (k.kayitZamani.getSecond()<10){// her bir kullanicinin kayit zamanindaki saniye if sartina sokuldu
                  System.out.println("Sansli kisisiniz "+ k.name);
              }else{
                  System.out.println("maalesef sansli kisi degilsiniz " + k.name);
              }
          }


      }
          public void listele(List<Kullanici> kullanicilar){

           for (Kullanici k:kullanicilar
                ) {// kayit al methodundan gelen kisiler listini donguye sokuyor
           System.out.println(" adi : "+ k.name+ " kayit zamani: "+ k.kayitZamani);  //kisiler listteki her bir kullanicininad ve kayit zamanini yazdirir

    }
}


}
