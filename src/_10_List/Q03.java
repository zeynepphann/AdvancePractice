package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> sayi = new ArrayList<>();
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);

        int kareToplam=0;
        for (int i = 0; i <sayi.size() ; i++) {
            kareToplam+=sayi.get(i)* sayi.get(i);

        }
        System.out.println(kareToplam);

    }
}
