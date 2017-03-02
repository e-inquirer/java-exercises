package org.launchcode.java.demos.java4python;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class 2 Prep Exercises
 */
public class ArrList {

    public static void main(String[] args) {

        // Declare integer List
        ArrayList<Integer> someInts = new ArrayList<>();

        //Declare even integer list
        ArrayList<Integer> evenInts = new ArrayList<>();

        // Sum variable
        int sum = 0;

        // Populate both ArrayLists
        for (int i = 1; i <=10; i++) {
            someInts.add(i);
            if (i%2 == 0) {
                evenInts.add(i);
            }
        }

        // Calculate sum of even numbers in ArrayList
        for (int i = 0; i < evenInts.size(); i++) {
            sum += evenInts.get(i);
        }

        System.out.println("The sum of the even elements of the ArrayList " + someInts + " is: " +
        sum);

    }

}
