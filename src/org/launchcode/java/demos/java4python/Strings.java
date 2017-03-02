package org.launchcode.java.demos.java4python;
import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class Strings {
    public static void main(String[] args) {
        String sentence;
        String searchTerm;
        Scanner in = new Scanner(System.in);

        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and" +
                " of having nothing to do: once or twice she had peeped into the book her sister was reading, but" +
                " it had no pictures or conversations in it, 'and what is the use of a book,' thought" +
                " Alice 'without pictures or conversation?'";

        System.out.print("What term would you like to search for in the sentence?: ");
        searchTerm = in.next();

        if (sentence.contains(searchTerm)) {
            System.out.println("The term " + searchTerm + " was FOUND in the sentence.");
        } else {
            System.out.print("The term " + searchTerm + " was NOT FOUND in the sentence.");
        }
    }
}
