/**
* Title: Rock, Scissors, Paper (aka Rock, Paper, Scissors)
* Description: Classic game of Rock, Paper, Scissors.
* Author: Cordell Bonnieux
* Date: 31/05/2021
* Class: CPSC 1150
* Assignment: Lab4
**/
import java.util.Scanner;
public class LogicalOps {
    public static void main(String[] args){

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user to enter 0, 1 or 2
        System.out.println("Select: rock (0), scissors (1), or paper (2)");

        userPlay(input.nextInt(), input);


    }
    public static int userPlay(input.nextInt(), input) {

        int output;

        try {

            output = userInput;

        } catch (InputMismatchException a) {

            // tell the user to try a new input
            System.out.println("Invalid entry, please enter: rock (0), scissors (1), or paper (2)");

            // restart the method
            userPlay(input.nextInt(), input);

        }

        return output;
    }
}