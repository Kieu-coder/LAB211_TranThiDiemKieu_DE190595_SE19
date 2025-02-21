
package week01;

import java.util.Scanner;


public class TestEquation {
    public static void main(String[] args) {
        Equation equation = new Equation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Calculate Equation -----");
        System.out.print("Enter 2 numbers to cal: ");
        equation.calculateSuperlativeEquation(scanner.nextDouble(), scanner.nextDouble());
        
        System.out.println("----- Calculate Quadratic Equation -----");
        System.out.print("Enter 3 numbers to cal: ");
        equation.calculateQuadraticEquation(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    }
}
