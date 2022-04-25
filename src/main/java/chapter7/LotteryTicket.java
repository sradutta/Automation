package chapter7;

/* generate a random number between 1 and 69 for the lottery ticket */

import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6; //capitalization indicates that this is a constant variable and shouldn't be changed
    private static final int MAXRANDOM = 69;

    public static void main(String args[]){
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }
    /* Method to generate the random numbers for the lottery ticket */
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i=0; i<LENGTH; i++){
            ticket[i] = random.nextInt(MAXRANDOM)+1; //Random generates between 0 and 68. To have between 1 and 69, we add 1
        }
        return ticket;
    }
    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
