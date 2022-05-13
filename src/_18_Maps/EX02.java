package _18_Maps;

import java.util.HashMap;
import java.util.Scanner;

public class EX02 {     /*

GUZEL BIR INTERVIEW SORUSU HALUK HOCA
    Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdiran method creat ediniz.
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
*/
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);

    System.out.println("bir metin giriniz: ");

    String metin= scan.nextLine();
        System.out.println(kelimeSay(metin));


    }

   public static HashMap<String,Integer> kelimeSay(String metin) {
   HashMap<String,Integer> kelimeSayisi =new HashMap<>();
   String [] arrMetin=metin.split(" ");// metnin her bir kelimesi metne atananid
       for (int i = 0; i < arrMetin.length ; i++) {
           if (kelimeSayisi.containsKey(arrMetin[i])) {//map'in kelime olan key'inde arrayden gelen kelime varsa bu kelime daha once map'e eklenip eklenmedigi kontrol edilier
               kelimeSayisi.put(arrMetin[i], kelimeSayisi.get(arrMetin[i])+1);// map'e key olarak kelime value olarak integer eklenir
                                    // virgule kadar STRING virgulden sonra INTEGER
           }else  kelimeSayisi.put(arrMetin[i] ,1); //Ali yoksa 1 koyar

       }


   return kelimeSayisi;

    }


}
