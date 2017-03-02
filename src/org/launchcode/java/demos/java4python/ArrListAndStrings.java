package org.launchcode.java.demos.java4python;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Class 2 Prep Exercises
 */
public class ArrListAndStrings {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name;
        Integer numNames = 0;

        // Name ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Five letter names
        ArrayList<String> fiveLetterNames = new ArrayList<>();

        System.out.println("Enter the names you wish to add to your list (or ENTER to finish):");

        // Get names
        do {
            name = in.nextLine();

            if (!name.equals("")) {
                names.add(name);
                numNames++;
            }
        } while(!name.equals(""));

        // Populate both ArrayLists
        for (String entry : names) {
            if (entry.length() == 5) {
                fiveLetterNames.add(entry);
            }
        }

        System.out.println("From the entered names, the following contain five letters: " + fiveLetterNames);

    }

}
