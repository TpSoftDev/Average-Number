//----------------------------------------------------------------------------------------- Average Number -----------------------------------------------------------------------------------------//
//This script computes the sum and average of all entered positive and negative integers.
import java.util.Scanner;
public class averageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0;

        //Counter to store the number of positive and negative numbers from user input.
        int posNums = 0;
        int negNums = 0;
        int total = 0;
        int avg = 0;
        int totalnum = 0;

        //Menu
        System.out.println("Welcome!");
        System.out.println("Please enter an array of integers to calculate the total and average. Enter 0 to indicate the end of your contribution.\n");

        do {
            System.out.println("Please Enter A Number :");
            userInput = sc.nextInt();

            //Determine the number of positive and negative integers entered by the user, and print out the result.
            if (userInput > 0) {
                posNums += 1;
                total += userInput;

            } else if (userInput < 0) {
                negNums += 1;
                total += userInput;
            }

            //Total Number of numbers entered by user.
            totalnum = posNums + negNums ;

            //Sum of all integers entered as well as the average.
            avg = total / totalnum;

        } while (userInput != 0);
        System.out.println("\nThank you! Here are your results below!" );
        System.out.println("Positive Numbers: " + posNums );
        System.out.println("Negative Numbers: " + negNums);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}