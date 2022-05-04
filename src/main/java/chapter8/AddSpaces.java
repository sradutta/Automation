package chapter8;

public class AddSpaces {
    public static void main(String[] args){
        addSpace("HelloWorld!It'sSra");
    }
    public static void addSpace(String text){
        var modifiedText = new StringBuilder(text);
        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, ' ');
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
