package org.launchcode.java.demos.java4python;
import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;

        System.out.print("Enter your name: ");
        name = in.next();

        System.out.println("Hello " + name);
    }
}
