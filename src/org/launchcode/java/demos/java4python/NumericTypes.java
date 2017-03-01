package org.launchcode.java.demos.java4python;
import java.util.Scanner;


/**
 * Created by ahmed on 2/27/17.
 */
public class NumericTypes {
    public static void main(String[] args) {

        Double length;
        Double width;
        Double area;
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Enter the dimensions of the rectangle:");
        System.out.print("length: ");
        length = in.nextDouble();
        System.out.print("width: ");
        width = in.nextDouble();

        area = length * width;

        System.out.print("The area of a rectangle with length " + length + " width " + width +
                         " is: " + area);
//        System.out.print(radius);
//        System.out.print(" is: ");
//        System.out.println(area);
    }
}
