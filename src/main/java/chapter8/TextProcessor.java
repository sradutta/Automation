package chapter8;

/* This method counts the number of words in a string
and prints them individually on a new line.
 */

public class TextProcessor {
    public static void main(String[] args){
        countWords("I love being a QA Engineer, testing and debugging and writing test cases");
    }
    public static void countWords(String text){
        var words = text.split(" ");
        int numOfWords = words.length;

        System.out.println("The number of words in the text is " +numOfWords);
        for(int i=0; i<numOfWords; i++)
            System.out.println(words[i]);
    }
}
