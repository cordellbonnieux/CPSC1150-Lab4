/**
* Title: LogicalOps
* Description: Tests to see if an integer is diviside by 5 or 6 or both.
* Author: Cordell Bonnieux
* Date: 31/05/2021
* Class: CPSC 1150
* Assignment: Lab4
**/
import java.util.Scanner;
public class LogicalOps {
    public static void main(String[] args){

        // create a new scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter an integer
        System.out.println("Please enter an integer.");

        // read int into num
        int num = input.nextInt();

        // boolean vars to indicate if num is divisible by 5 and/or 6
        boolean modBy5 = false, modBy6 = false, modByBoth = false, modByOne = false;

        // check if num is divisible by 5
        if (num % 5 == 0 ) modBy5 = true;
        
        // check if num is divisible by 6
        if (num % 6 == 0 ) modBy6 = true;

        // check if num is divisible by 5 and 6
        if (modBy5 && modBy6) modByBoth = true;

        // check if num is divisible by 5 or 6
        if (modBy5 || modBy6) modByOne = true;

        // print the results of num mod 5 and 6
        System.out.println("Is " + num + " divisible by 5 and 6? " + modByBoth);
        
        // print the results of num mod 5 or 6
        System.out.println("Is " + num + " divisible by 5 or 6? " + modByOne);

        // is num divided by 5 or 6 but noth both?
        System.out.print("Is " + num + " divisible by 5 or 6, but not both? ");
        if (modByOne && !modByBoth) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}