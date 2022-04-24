package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;
        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Okay grade but can do much better";
                break;
            case "D":
                message = "You need to work harder";
                break;
            case "F":
                message = "Oh oh!";
                break;
            default:
                message = "Error! invalid grade.";
                break;
        }
        System.out.println(message);
    }
}
