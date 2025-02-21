
package lab211_tranthidiemkieu_de190595_assignment;

import java.util.Scanner;
import week2.NormalCalculator;


public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("========== Calculator Program ==========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: ");
        int choice = sc.nextInt();
        NormalCalculator normalCalculator = new NormalCalculator();
        switch (choice) {
                case 1:
                    normalCalculator.runCalculator();
                    break;
                case 2:
                    normalCalculator.runBMICalculator();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }
}
