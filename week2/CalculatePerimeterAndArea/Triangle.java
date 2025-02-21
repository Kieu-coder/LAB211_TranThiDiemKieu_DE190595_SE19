
package week2.CalculatePerimeterAndArea;


public class Triangle extends Shape{
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    

    @Override
    public double getPerimeter() {
         return this.getSideA() + this.getSideB() + this.getSideC();
    }

    @Override
    public double getArea() {
        double s= getPerimeter() / 2;
        return Math.sqrt(s*(s-sideA)* (s-sideB)*(s-sideC));
    }

    @Override
    public void printResult() {
        System.out.println("---------------Triangle-------------");
        System.out.println("Side A: " + getSideA()+"\n" + "side B: " +getSideB() +"\n"+ "Side C: " + getSideC());
        System.out.println("The area: " + getArea());
        System.out.println("The perimeter: " + getPerimeter());
    }
    
}
