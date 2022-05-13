package _09_Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[]={1,2,3,4,5,6,7};

        int toplam=0;

        int sayac=1;

        for (int sayi: input
             ) {
            toplam+=sayi;

        }

        int ortalama = toplam/ input.length;

        for (int i = 0; i < input.length ; i++) {
            if (input[i]>=ortalama){
                sayac++;
                System.out.print(input[i]+ " ");

            }

        }
        System.out.println(" ");
        System.out.println("Ortalamadan buyuk olan sayilar : " + sayac);







    }

}


