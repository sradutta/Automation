/* A simple program that gets inputs from user and outputs a sentence */
package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]){

        //Asks for a season and save the input
        System.out.println("Enter your favorite season: ");
        Scanner scanner = new Scanner(System.in);
        String favSeason = scanner.next();

        //Asks for an adjective and save the input
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();

        //Asks for a whole number and save the input
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        //Output the result
        System.out.println("On a "+adjective+" "+favSeason+" day, I drink a minimum of "+number+" cups of coffee");

    }


}
