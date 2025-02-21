
package week2.CalculatePerimeterAndArea;

public class Circle extends Shape{
    private double Radius;

    public Circle(double Radius) {
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }
    

    @Override
    public double getPerimeter() {
        return Math.PI*2*getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public void printResult() {
        System.out.println("---------------Circle-------------");
        System.out.println("Radius: " + getRadius());
        System.out.println("The area: " + getArea());
        System.out.println("The perimeter: " + getPerimeter());
    }
    
}
