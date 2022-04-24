package chapter4;

/* Objective is to travel the game board of 20 spaces with 5 die rolls.
Roll the die and generate a random number between 1 and 6, and advance
that number of spaces on the board. After each roll, tell the user which
game space they are on and how many more spaces to go. If the user gets
to 20 spaces before 5 rolls, they win; they go above or below 20 spaces,
they lose. */

import java.util.Random;

public class RollDieGame {
    public static void main(String args[]){

        //initialize
        int boardSize = 20;
        int maxDieRoll = 5;
        int initialBoardPos = 0;

        //generate random numbers and move to that many spaces
        Random random = new Random();
        int numSpaceMoved;

        for(int j=0; j<maxDieRoll; j++){
            numSpaceMoved = random.nextInt(6)+1; //random generates number between 0 and 5, and thus 1 is added
            initialBoardPos = initialBoardPos + numSpaceMoved;
            if(initialBoardPos > boardSize)
                break;
            System.out.println("You have moved "+numSpaceMoved+" spaces. You are now" +
                    " at "+initialBoardPos+" position");
        }
        if(initialBoardPos == boardSize){
            System.out.println("Congratulations! You have won");
        }
        else if(initialBoardPos > boardSize){
            System.out.println("Sorry! you have lost as you have exceed more than the board spaces");
        }
        else{
            System.out.println("Sorry! you have lost as you have not covered all the board spaces");
        }}
}
