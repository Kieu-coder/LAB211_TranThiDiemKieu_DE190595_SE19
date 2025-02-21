 
package week2.CalculatePerimeterAndArea;


public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    

    @Override
    public double getPerimeter() {
        return 2*(getLength()+getWidth());
    }

    @Override
    public double getArea() {
        return getWidth()*getLength();
    }

    @Override
    public void printResult() {
        System.out.println("---------------Rectangle-------------");
        System.out.println("Width: " + getWidth()+"\n" + "length: " + getLength());
        System.out.println("The area: " + getArea());
        System.out.println("The perimeter: " + getPerimeter());
    }
    
}
