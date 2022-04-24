package chapter6;

/* Write a class that creates instances of the
Rectangle class to find the total area of two
rooms in the house. */

public class HomeAreaCalculator {
    public static void main(String args[]){

        /* Rectangle 1 */
        Rectangle room1 = new Rectangle(); //room1 has a datatype of Rectangle. new Rectangle is the instance. room1 is the object
        //We can also call the constructor Rectangle room1 = new Rectangle(25, 50);
        room1.setLength(25);
        room1.setWidth(50);
        double areaRoom1 = room1.calculateArea();
        /* Rectangle 1 */

        /* Rectangle 2 */
        Rectangle room2 = new Rectangle(30, 40);
        double areaRoom2 = room2.calculateArea();
        /* Rectangle 2 */

        double totalArea = areaRoom1 + areaRoom2;
        System.out.println("The total area is "+totalArea);
    }
}
