package chapter3;

/* Enter enough changes to equal exactly $1. Ask user
to enter quantities for pennies, nickels, dimes and
quarters. Program should count up values of the change.
If it is $1, the user wins; if it is over $1, the
program tells the user by how much they went over.
If it is below $1, the program tells how much they
went under.
 */

import java.util.Scanner;

public class DollarGame {
    public static void main (String args[]){

        //Ask user to enter changes
        System.out.println("How many pennies: ");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();
        System.out.println("How many nickels: ");
        int nickels = scanner.nextInt();
        System.out.println("How many dimes: ");
        int dimes = scanner.nextInt();
        System.out.println("How many quarters: ");
        int quarters = scanner.nextInt();

        //Count the values
        double value = pennies*0.01 + nickels*0.05 + dimes*0.10 + quarters*0.25;

        //Give out output
        if(value == 1)
            System.out.println("Congratulations! you have won");
        else if(value < 1)
            System.out.println("Sorry! you loss. You are less by "+(1-value) +" cents");
        else
            System.out.println("Sorry! you loss. You are more by "+(value-1)+" cents");
    }
}
