package _09_Arrays;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         {" " =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        String str = "Javacilar cook afilli";
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        int sayac = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                sayac++;
            } else {
                System.out.print(arr[i - 1] + " = " + (sayac+1) + " , ");
                sayac = 0;
            }

            if (i == arr.length - 1) {
                System.out.print(arr[i] + " = " + (sayac+1)+ " ");
            }

        }















    }


    }

    

