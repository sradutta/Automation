package chapter6;

public class MonthConverter {
    public static void main(String args[]){
        System.out.println(Month.getMonth(5));
        System.out.println(Month.getMonth("October")); //we can access them without instantiating because all are static
    }
}
