package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int elemanSayisi= scan.nextInt();

		int arr[]= new int[elemanSayisi];

		for (int i = 0; i <elemanSayisi ; i++) {
			System.out.println("lutfen "+ (i+1)+ "sayiyi giriniz");
			arr[i]=scan.nextInt();
		}


	}


}
