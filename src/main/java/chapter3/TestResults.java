package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]){

        //get test score
        System.out.println("Enter your test scrore: ");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();
        scanner.close();

        //determine letter grades
        char grade;
        if (testScore < 60){
            grade = 'F';
        }
        else if (testScore < 70){
            grade = 'D';
        }
        else if (testScore < 80){
            grade = 'C';
        }
        else if (testScore < 90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is "+grade);
    }
}
