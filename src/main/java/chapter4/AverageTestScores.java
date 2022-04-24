package chapter4;

/* Nested loops -- find the average of each student's test scores */

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){

        //initializations
        int numberOfStudents = 24;
        int numberOfTests = 4;
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);

        //process all students
        for(int i=0; i<numberOfStudents; i++){
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for test #"+(j+1)+" for student #"+(i+1));
                double score = scanner.nextDouble();
                total = total +score;
            }
            double average = total/numberOfTests;
            System.out.println("The average for student #"+(i+1)+"is "+average);
        }
        scanner.close();
    }
}
