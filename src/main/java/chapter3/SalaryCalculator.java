package chapter3;

import java.util.Scanner;

/* All salespeople get a salary of $1000/week.
Salespeople who exceeds 10 sales a week gets an additional bonus of $250
 */
public class SalaryCalculator {
    public static void main(String args[]){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;

        //Get the unknown values
        System.out.println("How many sales did the employee make this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Check for bonuses
        if(sales > 10){
            salary = salary + bonus;
        }

        //Output the results
        System.out.println("The employee's salary is $"+salary);
    }
}
