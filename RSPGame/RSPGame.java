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

        // 1. prompt user to enter an integer (0, 1 or 2)
        // 2. read int, and check if valid
        // 3. if it's valid it is store in 'user' - if not, the method restarts
        int user = userPlay(input);

        //
        int min = 0, max  = 2;

        //
        double computer = Math.random() * (3);

        System.out.println(computer);

        



    }
    public static int userPlay(Scanner input) {

        // prompt the user to enter 0, 1 or 2
        System.out.println("Select: rock (0), scissors (1), or paper (2)");

        // read int from user
        int num = input.nextInt();

        if (num > 2 || num < 0)

            // if user input is not valid restart method
            return userPlay(input);

        else

            // if user input is valid, return it
            return num;

    }
}