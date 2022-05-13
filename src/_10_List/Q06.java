package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(7);
        sayilar.add(5);
        sayilar.add(9);
        sayilar.add(1);

        tekrarsizListeOlustur(sayilar);

    }

    private static void tekrarsizListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsizList=new ArrayList<>();


        for (int i = 0; i <sayilar.size() ; i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsizList);

    }

}
