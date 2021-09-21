/*
 *  Assignment 2
 *  Description: Print Statements Saying Hello
 *  Name: Rick
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class Prelab2 {

    public static void main(String[] args) {

        double area;
        int radius = 10;
        double pi = 3.14;

        area = radius * radius * pi;

        System.out.println("Welcome, to my program!");

        // Printing an int value
        System.out.println(100);

        // Printing a double value
        System.out.println(area);

        // Declaring a String variable
        String studentName;

        // Assigning a value to the String variable
        studentName = "Paul Rolam";

        // Declaring an int variable
        int studentAge;

        // Assigning a value to an int variable
        studentAge = 12;

        /*
            Declaring a double variable and assigning
            a value in a one line.
         */

        double studentGpa = 3.76;

        // Printing all variables values
        System.out.println(studentName);
        System.out.println(studentAge);
        System.out.println(studentGpa);

        // Creating the Scanner object
        Scanner input = new Scanner(System.in);

        // Present a question to the user
        System.out.print("What is your name? ");

        // Store the user in put in a variable
        String userName = input.nextLine();

        // Print the user's name back to the display console
        System.out.print("The user's name is ");
        System.out.println(userName);
    }
}
