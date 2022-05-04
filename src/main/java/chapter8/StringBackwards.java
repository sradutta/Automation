package chapter8;

public class StringBackwards {
    public static void main(String[] args){
        reverseString("Hello Gigantic");
    }
    public static void reverseString(String word){
        for(int i = word.length()-1; i >=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
