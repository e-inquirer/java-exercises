package org.launchcode.java.studios;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by ahmed on 2/27/17.
 */
//
public class CountingCharacters {
    public static void main(String[] args) {

        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc " +
                "accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent " +
                "quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non " +
                "lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = sentence.toCharArray();

        // ArrayList of character counts
        Map <Character, Integer> charCount = new HashMap<>();

        for (Character c: charactersInString) {
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                charCount.put(c, ++count);
            } else {
                charCount.put(c, (Integer) 1);
            }
        }

        for (Map.Entry<Character, Integer> counts: charCount.entrySet()) {
            System.out.println(counts.getKey() + ": " + counts.getValue());
        }

   }
}
