import java.util.Arrays;
import java.util.Scanner;

public class Miain {

    public static void main (String[] args){

        // enter map layout
        //Scanner keyboard = new Scanner(System.in);
        //String mapLayout = keyboard.nextLine();

        // map layouts for testing
        //String mapLayout = "xxxxxxxxxGxxxx$xxxT";
        String mapLayout = "xxxxxTxxxxGxxxxxxxx$xx";

        // convert map layout to Array and locate index of $
        String[] arrayMap = mapLayout.split("");
        System.out.println(Arrays.toString(arrayMap));


        // TODO: add condition for: Multiple $, T, G present or missing

        int indexMoney = 0;
        for (int i = 0; i <= arrayMap.length-1; i++) {
            if (arrayMap[i].equals("$")) {
                indexMoney = i;
            }
        }
        System.out.println(indexMoney);
    }
}
