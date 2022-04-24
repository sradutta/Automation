package chapter4;

/* do-while loop. This program allows users to
enter and sum up two numbers. The user continues
adding up until they indicate they are done with
numbers. */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){

        boolean again;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum of the two entered numbers is: "+sum);

            System.out.println("Would you like to run again? Enter as true or false");
            again = scanner.nextBoolean();
        }while(again);
        scanner.close();

    }

}
