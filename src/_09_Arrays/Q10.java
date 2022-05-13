package _09_Arrays;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

         */

        String kelime="GayetBasarılı";
        kelime=kelime.replace("gayet","coook");
        // System.out.println(kelime);
        String[] arr=new String[1]; // uzunlugu belirlemek icin
        arr[0]=kelime;// kelimeyi arrays yapmak icin bu adimlari takip ediyoruz
        System.out.println(Arrays.toString(arr));






    }

}
