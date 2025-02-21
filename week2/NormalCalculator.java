
package week2;

import java.util.Scanner;


public class NormalCalculator {
    Scanner scanner = new Scanner(System.in);
    public double calculator(double num1,  String oper, double num2){
        switch(oper){
            case "+" ->{
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            case "/" ->{
                return num1 / num2;
            }
            default -> throw new IllegalAccessError();
        }
    }
    
   public void runCalculator() {
        
        boolean firstInput = true;
        System.out.println("enter number 1: ");
        double num1 = scanner.nextDouble();
        double temp = 0;
        while (true){
            if (firstInput) {
                temp = num1;
                firstInput = false;
            } else {
                System.out.print("Enter operator (+, -, *, /, = ): ");
                String operator = scanner.next();

            if (operator.equals("=")){
                System.out.println("final result: " + temp);
                return;
            }
            if (!"+-*/".contains(String.valueOf(operator))) {
                    System.out.println("Please input (+, -, *, /). Try again.");
                    continue;
                }
            System.out.println("enter number 2: ");
            double num2 = scanner.nextDouble();

            temp = calculator(num1, operator, num2);
            System.out.println("Result = " + temp);
            }
       
        }
    }
    public void calculateBMI(double bmi){
        if (bmi < 19){
            System.out.println("Under-standard.");
        } else if(bmi > 19 && bmi <= 25){
            System.out.println("Standard.");
        } else if(bmi > 25 && bmi <= 30){
            System.out.println("Overweight.");
        } else if(bmi > 30 && bmi <= 40){
            System.out.println("Fat - Should lose weight.");
        } else if(bmi > 40){
            System.out.println("Very fat - should lose weight immediately.");
        }
    }
    public void runBMICalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter Height (cm): ");
        double heightCm = scanner.nextDouble();

        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Weight and height must be positive values.");
            return;
        }

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        System.out.printf("BMI Number: %.2f%n", bmi);
        calculateBMI(bmi);

    }
}
