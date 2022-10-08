//import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // enter map layout
        Scanner keyboard = new Scanner(System.in);
        String mapLayout = keyboard.nextLine();

        // map layouts for testing
        //String mapLayout = "xxxxxxxxxGxxxx$xxxT";
        //String mapLayout = "xxxxxTxxxxGxxxxxxxx$xx";
        //String mapLayout = "xxxxGxxxxTxxx$x";
        //String mapLayout = "$xxxxxxxxxGxxxxxxxTxx";
        //String mapLayout = "$xxTxxxxxxxGxxxxxxxxx";
        //String mapLayout = "xxxxxxGxxxxTxx$xxx";



        // convert map layout to Array and locate index of $
        String[] arrayMap = mapLayout.split("");
        //System.out.println(Arrays.toString(arrayMap));
        int guard = -1;
        int thief = -1;
        int indexMoney = -1;

        for (int i = 0; i <= arrayMap.length - 1; i++) {
            if (arrayMap[i].equals("$")) {
                indexMoney = i;
            }
        }

        // searching for (T)hief and (G)uard index locations to LEFT of ($) index.
        //System.out.println(indexMoney);

        for (int i = indexMoney - 1; i >= 0; i--) {
            if (arrayMap[i].equals("T")) {
                thief = i;
            } else if (arrayMap[i].equals("G")) {
                guard = i;
            }
        }

        // searching for (T)hief and (G)uard index locations to RIGHT of ($) index.
        for (int i = indexMoney + 1; i <= arrayMap.length - 1; i++) {
            if (arrayMap[i].equals("T")) {
                thief = i;
            } else if (arrayMap[i].equals("G")) {
                guard = i;
            }
        }

        // TODO: add condition for: Multiple $, T, G present.

        // error if missing content else continue
        if (indexMoney == -1 || guard == -1 || thief == -1) {
            System.out.println("ERROR. Incorrect String map structure.");
        }
        /*
        } else {
            System.out.println(mapLayout);
            System.out.println("$ position: " + indexMoney);
            System.out.println("Thief position: " + thief);
            System.out.println("Guard position: " + guard);
        }
*/
        else if ((indexMoney > guard && guard > thief) || (indexMoney < guard && guard < thief)) {
            System.out.println("safe");
        } else {
            System.out.println("ALARM");
        }
    }
}