package chapter7;

/* generate random numbers from 1 to 69 and
use that to create a ticket. Do a sequential
and binary search to see if any number is
duplicated. */

import java.util.Arrays;
import java.util.Random;

public class LotteryTktWithArraySearch {
    private static final int LENGTH = 6;
    private static final int RANDOMBOUND = 69;

    public static void main(String args[]){

        //create a ticket with the generated numbers
        int[] ticket = generateNumbers();
        Arrays.sort(ticket); //testing for fun

        //print it out
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        Random random = new Random();
        int[] ticketNumbers = new int[LENGTH];
        int randomnumber;

        for(int i=0; i<LENGTH; i++){
            /* Generate random number then search to make sure
            it doesn't already exist in the array. If it does,
            regenerate and search again */
            do{
                randomnumber = random.nextInt(RANDOMBOUND)+1;
            }while(search(ticketNumbers, randomnumber));

            //Number is unique if we get here. Add it to the array.
            ticketNumbers[i] =randomnumber;
        }
        return ticketNumbers;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not.
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //This is called an enhanced loop. It iterates through the array
        //and each time assigns the current element to 'value.'
        for(int value: array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        //if we've reached this point, the entire array was searched.
        //The value was not found.
        return false;
    }
    public static boolean binarySearch(int[] array, int numberToSearchFor){

        //Array must be sorted
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0)
            return true;
        else
            return false;
    }
    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i]+" | ");
        }
    }
}
