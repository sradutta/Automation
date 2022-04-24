package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        /* getRoom is non-static. We are calling it from static main.
        Thus, compiling issues. To avoid that, we create an instance of
        the class where getRoom is defined and use that to access getRoom.
        Thus, in this way we can access non-static things through static main.
         */
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom(); //static is used when you don't want to create a new instance of the class.
        double area = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area is "+area);
        calculator.scanner.close();

    }
    public Rectangle getRoom(){ //this is non-static.
        System.out.println("Enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle room1, Rectangle room2){
        return room1.calculateArea()+room2.calculateArea();
    }
}
