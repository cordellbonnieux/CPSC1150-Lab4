/**
* Title: Sort3 
* Description: Takes 3 numbers, prints them in acending order.
* Author: Cordell Bonnieux
* Date: 31/05/2021
* Class: CPSC 1150
* Assignment: Lab4
**/
import java.util.Scanner;
public class Sort3 {
    public static void main(String[] args){

        // Create a Scanner object named input.
        Scanner input = new Scanner(System.in);

        // declaring variables to sort values
        int smallest, middle, largest;

        // Prompt user to enter first number
        System.out.println("Please enter your first integer.");

        // Read first number into a
        int a = input.nextInt();

        // Prompt user to enter second number
        System.out.println("Please enter your second integer.");

        // Read second number into b
        int b = input.nextInt();

        if (a > b) {

            // if a is bigger than b
            largest = a;
            middle = b;

        } else {

            // if b is bigger than a
            largest = b;
            middle = a;

        }

        // Prompt user to enter third number
        System.out.println("Please enter your third integer.");

        // Read second number into c
        int c = input.nextInt();

        
        if (c > middle) {

            if (c > largest) {

                // if c is the largest number
                smallest = middle;
                middle = largest;
                largest = c;

            } else {

                // if c is the middle number
                smallest = middle;
                middle = c;

            }

        } else {

            // if c is the smallest
            smallest = c;

        }

        // print the numbers in ascending order
        System.out.println(smallest + " " + middle + " " + largest);

    }
}