package chapter3;

/* If-else: Salesperson gets a congratulatory note
if they exceed 10 sales per week; else, they are
informed of how many sales they were short
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){

        //Initialize values
        int quota = 10;

        //Get the unknown values
        System.out.println("How many sales did you make you this week? Enter the value: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take
        if(sales > quota){
            System.out.println("Congratulations: you have made your quota");
        }
        else{
            System.out.println("You have not made your quota; you are short by "+(quota-sales));
        }
    }
}
