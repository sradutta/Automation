package chapter5;

/*
Variable Scope -- Write an instant credit check
program that approves anyone who makes more than
$25,000 and has a credit score of 700 or better.
Reject all others
 */

import java.util.Scanner;

public class InstantCreditCheck {
    //initialize
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //check if user qualifies
        boolean qualified = isUserQualified(salary,creditScore);

        //notify the user
        notifyUser(qualified);

    }
    public static double getSalary(){
        System.out.println("Enter your salary: ");
        double enteredSalary = scanner.nextDouble();
        return enteredSalary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int enteredCreditScore = scanner.nextInt();
        return enteredCreditScore;
    }
    public static boolean isUserQualified(double salary, int creditScore){
        if(salary > requiredSalary && creditScore > requiredCreditScore){
            return true;
        }
        else{
            return false;
        }
    }
    public static void notifyUser(boolean qualified){
        if(qualified){
            System.out.println("You are qualified");
        }
        else{
            System.out.println("You are not qualified");
        }
    }
}
