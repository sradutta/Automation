package chapter3;

/*
Nested ifs: To qualify for a loan, a person
must be making at least $30000 and have been
working at their current job for at least 2 years
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){

        //initialize known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get unknown values
        System.out.println("How much do you make? Please enter it: ");
        Scanner scanner = new Scanner(System.in);
        double enteredSalary = scanner.nextDouble();
        System.out.println("How many years you are working? Please enter: ");
        int enteredYearsEmployed = scanner.nextInt();
        scanner.close();

        //make decisions
        if(enteredSalary >= requiredSalary) {
            if (enteredYearsEmployed >= requiredYearsEmployed)
                System.out.println("You are qualified for a loan");
            else
                System.out.println("You do not qualify for a loan as you have worked for less than 2 years");
        }
        else{
            System.out.println("You do not have the required salary of "+requiredSalary);
        }
    }
}
