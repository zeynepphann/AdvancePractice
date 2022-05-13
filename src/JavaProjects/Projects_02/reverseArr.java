package JavaProjects.Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {

      /*
        Given String array

        reverse the String array

        print the reversed array

        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);


     */


    /*

          Verilen String array

String arrayi ters çevir

ters arrayi yazdır

       NOT:
       Arrays.toString(your_array_name);  <--- kullanın

     */

    /*
    Hocanin yaptigi calismiyor   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

     //        code start here

     //        Koda burdan başlayın


        String[] reversed = new String[useThisArray.length];

        int counter = 0 ;

        for(int i = useThisArray.length-1 ; i >=0 ; i--){

            reversed[counter++] = useThisArray[i];

        }


        System.out.println(Arrays.toString(reversed));
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

        System.out.println(Arrays.toString(useThisArray));   //[java, guzeldir]
        //code start here


        String[] tersArr= new String [useThisArray.length];

        int counter=0;

        for (int i = 0 ; i < useThisArray.length-1 ; i++) {
            tersArr[i]= useThisArray[useThisArray.length-1];
            counter++;
        }
        System.out.println(tersArr);

    }


    }












