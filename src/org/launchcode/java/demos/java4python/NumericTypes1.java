package org.launchcode.java.demos.java4python;
import java.util.Scanner;


/**
 * Created by ahmed on 2/27/17.
 */
public class NumericTypes1 {
    public static void main(String[] args) {

        Double miles;
        Double gas;
        Double milesPerGal;
        Scanner in;
        in = new Scanner(System.in);

        System.out.print("Enter the miles you've driven: ");
        miles = in.nextDouble();
        System.out.print("Enter the gallons of gas you've consumed: ");
        gas = in.nextDouble();

        milesPerGal = miles/gas;

        System.out.print("Having driven " + miles + " mi., and consuming " + gas +
                        " gallons of gas, your miles per gallon is: " + milesPerGal);
    }
}
