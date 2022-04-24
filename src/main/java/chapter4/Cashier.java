package chapter4;

/* for loop -- the program scans a given number of items
and tally the cost. */

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){

        //get the number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        //crete the loop
        double total = 0.0;
        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        System.out.println("The total is: "+total);
        scanner.close();
    }
}
