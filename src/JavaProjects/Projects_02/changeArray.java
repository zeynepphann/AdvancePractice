package JavaProjects.Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine().toLowerCase();
        // String[] UseThisArray = myStr.split("");

           //        Koda burdan başla
           //        kullanman gereken -> UseThisArray
        myStr=myStr.replaceAll("orange","Apple");
        String yeniArr[]=new String[myStr.length()];



        System.out.println(myStr);

        /*
        for(int i = 0 ; i<UseThisArray.length ; i++){
        if(UseThisArray[i].equals("Orange")){
                UseThisArray[i] = "Apple";

            }

        }

        System.out.println(Arrays.toString(UseThisArray));
         */



    }
}