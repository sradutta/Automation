/* A simple program to calculate the grosspay based on number of hours worked and payrate */
package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]){

        //1. Get the number of hours worked;
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in); //this scans the information
        int hours = scanner.nextInt(); //then it reads the integer

        //2. Get the hourly payrate;
        System.out.println("Enter the employee's payrate: ");
        double rate = scanner.nextDouble();
        scanner.close(); //need to close to free up memory

        //3. Multiply hours and payrate;
        double grossPay = hours * rate;

        //4. Display results;
        System.out.println("The employee's grosspay is: $"+grossPay);
    }
}
