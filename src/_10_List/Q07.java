package _10_List;

import java.awt.font.FontRenderContext;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

        boolean a= true;

        int elemanSayisi = arr1.length;

        if (elemanSayisi % 2 != 0) { // eleman sayısı tekse simetrikliğe bakmayacağız
            System.out.println("Verilen arrayin simetrik olması için çift sayı adedinde elemanı olması gereklidir");

        } else {//eleman sayısı çift ise simetri kontrolüne başlayacağız
            for (int i = 0; i <arr1.length ; i++) {
                if (arr1[i]==arr1[elemanSayisi-1]){
                    a=true;
                    elemanSayisi--;
                }  else {a=false;
                    break;
                }

        }

        if(a){
            System.out.println("Verilen array simetriktir: ");
        } else System.out.println("simetrik değildir...");

        }

    }

}
