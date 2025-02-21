
package week01;


public class Equation {
     void calculateSuperlativeEquation(double a, double b){
         if (a != 0) {
             double x = -b/a;
             System.out.println("Solution: x = " +x);
         } else {
             System.out.println("Invalid equation! Coefficient A must not be 0.");
         }
         checkNumberProperties(a, b);
     }
    
     void calculateQuadraticEquation(double a, double b,double c) {
         
             if (a != 0) {
             double delta = (b*b) - (4*a*c);
             if (delta > 0) {
                 double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                 double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                 System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
             } else if (delta == 0) {
                 double x = -b / (2 * a);
                 System.out.println("Solution: x = " + x);
             } else {
                 System.out.println("No real solution.");
             }
         }
         checkNumberProperties(a, b, c);
     }
     
     void checkNumberProperties(double... numbers) {
         System.out.print("Odd Number(s): ");
         for (double num : numbers) {
             if ((int) num % 2 != 0) {
                 System.out.print(num + " ");
             }
         }

         System.out.print("\nNumber is Even: ");
         for (double num : numbers) {
             if ((int) num % 2 == 0) {
                 System.out.print(num + " ");
             }
         }

         System.out.print("\nNumber is Perfect Square: ");
         for (double num : numbers) {
             if (num >= 0 && Math.sqrt(num) == (int) Math.sqrt(num)) {
                 System.out.print(num + " ");
             }
         }
         System.out.println();
     }
     
     
}
