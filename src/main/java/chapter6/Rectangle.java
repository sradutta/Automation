package chapter6;

public class Rectangle {
    double length;
    double width; //global variables are known as fields

    /* constructors */
    public Rectangle(){
        length = 0.0;
        width = 0.0;
    }
    public Rectangle(double length, double width){
        this.length = length;
        setWidth(width); //can also be written as this.width = width;
    }
    /* constructors */

    /* Getters and Setters */
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    /* Getters and Setters */

    double calculatePerimeter(){
        return (2*length + 2*width);
    }
    double calculateArea(){
        return length*width;
    }
}
