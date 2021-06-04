/**
* Title: Rock, Scissors, Paper (aka Rock, Paper, Scissors)
* Description: Classic game of Rock, Paper, Scissors.
* Author: Cordell Bonnieux
* Date: 31/05/2021
* Class: CPSC 1150
* Assignment: Lab4
**/
import java.util.Scanner;
public class RSPGame {
    public static void main(String[] args){

        // create scanner object
        Scanner input = new Scanner(System.in);

        // 1. prompt user to enter an integer (0, 1 or 2)
        // 2. read int, and check if valid
        // 3. if it's valid it is store in 'user' - if not, the method restarts
        int user = userPlay(input);

        // computer generates an integer; either 0, 1 or 2
        int computer = 0 + (int) (Math.random() * 3);

        // display the plays in the comsole
        System.out.println("Computer played: " + playName(computer));
        System.out.println("You played: " + playName(user));

        // check to see who won and print the appropriate message
        if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0))
            System.out.println("You win!");
        else if ((computer == 0 && user == 1) || (computer == 1 && user == 2) || (computer == 2 && user == 0))
            System.out.println("You loose!");
        else 
            System.out.println("It's a draw!");
        
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
    public static String playName(int play) {
        
        // return the name of the play (i.e. rock, paper or scissors)
        if (play == 0)
            return "rock";
        else if (play == 1)
            return "scissors";
        else 
            return "paper";

    }
}