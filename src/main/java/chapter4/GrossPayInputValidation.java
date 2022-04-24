package chapter4;

/* While loop. Employees make $15/hour. The program
allows the number of hours worked for the week.
Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){

        //initialize known variables
        int rate = 15;
        int maxHours = 40;

        //get input for unknown variables
        System.out.println("How many hours did you work? Please enter: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate loop
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid input. Your hours must be between 1 and 40. Try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println("your gross pay is: $"+gross);
    }
}
