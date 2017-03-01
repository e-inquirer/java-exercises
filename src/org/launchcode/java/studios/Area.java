package org.launchcode.java.studios;
import java.util.Scanner;


/**
 * Created by ahmed on 2/27/17.
 */
public class Area {
    public static void main(String[] args) {

        Double radius;
        Double area;
        Scanner in;
        in = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        radius = in.nextDouble();

        area = 3.14 * radius * radius;

        System.out.print("The area of a circle of radius ");
        System.out.print(radius);
        System.out.print(" is: ");
        System.out.println(area);
    }
}
