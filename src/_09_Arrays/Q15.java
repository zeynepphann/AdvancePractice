package _09_Arrays;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
		/*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};

         */

        int []arr={2,6,4,8,2,6,2};

        if(arr[0]==arr[arr.length-1]){
            System.out.println("ilk ve son sayi birbirine esit");
        }else {
            System.out.println("ilk ve son sayi ayni degil ");
        }












        /*
         Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 8 adet sayi giriniz");
        int arr []={2,6,4,8,2,6,2};

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scan.nextInt();
            if(arr[0]== arr[arr.length-1]){
                System.out.println("giridiginiz ilk ve son karakter aynidir");
            }else{
                System.out.println("giridiginiz ilk ve son karakter ayni degildir");
            }
        }

         */








    }

}
