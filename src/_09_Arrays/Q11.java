package _09_Arrays;

public class Q11 {

    public static void main(String[] args) {
        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */


        int toplam1=0;
        int toplam2=0;
        int arr1[][]={ {1,2}, {3,4,5}, {6} };
        int arr2[][]={ {7,8,9}, {10,11}, {12} };

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                toplam1+=arr1[i][j];
            }

        }
        System.out.println(toplam1);

        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                toplam2+=arr2[i][j];
            }

        }
        System.out.println(toplam2);

        System.out.println("iki arreysin toplami : " +(toplam1 +toplam2));
    }

}
