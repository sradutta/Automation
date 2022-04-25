package chapter7;

/* This program allows  users to enter any number
of grades, and provides them with the avg, max and
min. */

import java.util.Scanner;

public class Grades {
    private static int[] grades;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("How many grades do you want to enter: ");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average: "+String.format("%.2f", calculateAvg()));
        System.out.println("The lowest grade is "+getLowest());
        System.out.println("The highest grade is "+getHighest());
    }
    public static void getGrades(){
        for(int i=0; i<grades.length; i++){
            System.out.println("Enter grade #"+(i+1));
            grades[i] = scanner.nextInt();
        }
    }
    public static int sumOfGrades(){
        int sum = 0;
        for(int grade: grades){
            sum = sum + grade;
        }
        return sum;
    }
    public static double calculateAvg(){
        return sumOfGrades()/grades.length;
    }
    public static int getHighest(){
        int highest = grades[0];
        for(int grade: grades){
            if(grade > highest)
                highest = grade;
        }
        return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for(int grade: grades){
            if(grade < lowest)
                lowest = grade;
        }
        return lowest;
    }

}
