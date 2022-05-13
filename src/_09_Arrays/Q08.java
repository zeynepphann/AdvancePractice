package _09_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        double dolar=0;
        double euro=0;
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";


        String yenistr[]=str.split(" ");

        System.out.println(Arrays.toString(yenistr));


        for (int i = 0; i <yenistr.length ; i++) {
            if (yenistr[i].contains("$")){
                dolar+= Double.parseDouble(yenistr[i].replace("$",""));

            }else if (yenistr[i].contains("£")){
                euro+= Double.parseDouble(yenistr[i].replace("£",""));
            }

        }
        System.out.println("Toplam dolariniz: " + dolar);
        System.out.println("Toplam euronuz: " + euro);





    }
}


