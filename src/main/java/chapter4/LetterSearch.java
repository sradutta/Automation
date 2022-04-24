package chapter4;

/* loop break -- Search a string to determine if it contains "A" */

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]){

        //get the text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        //search for "A"
        boolean letterFound = false;
        for(int i = 0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound == true)
            System.out.println("The string contains the letter A");
        else
            System.out.println("The string does not ocntain the letter A");
    }
}
