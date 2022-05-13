package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

       */

        Scanner scanner=new Scanner(System.in);
        String girilen="";

        do {
            System.out.println("harf giriniz");
            girilen= scanner.next();
            System.out.println("program calisiyor");

        }while (!girilen.equalsIgnoreCase("x"));

        System.out.println("Program bittiii");
        scanner.close();


    }
}
