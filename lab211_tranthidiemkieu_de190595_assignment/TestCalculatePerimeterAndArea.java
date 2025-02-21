
package lab211_tranthidiemkieu_de190595_assignment;

import java.util.Scanner;
import week2.CalculatePerimeterAndArea.Circle;
import week2.CalculatePerimeterAndArea.Rectangle;
import week2.CalculatePerimeterAndArea.Triangle;


public class TestCalculatePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==========Calculator Shape Program===============");
        System.out.print("Input side width of Rectangle: ");
        double temp = scanner.nextDouble();
        System.out.print("Input length of Rectangle: ");
        Rectangle rectangle = new Rectangle(temp, scanner.nextDouble());
        
        System.out.print("Input radius of Circle: ");
        Circle circle = new Circle(scanner.nextDouble());
        
        System.out.print("Input side A of Triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Input side B of Triangle: ");
        double b= scanner.nextDouble();
        System.out.print("Input side c of Triangle: ");
        Triangle triangle = new Triangle(a, b, scanner.nextDouble());

        
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
        
        
    }
}
