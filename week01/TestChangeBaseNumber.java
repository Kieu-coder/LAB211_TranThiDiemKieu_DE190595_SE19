
package week01;

import java.util.Scanner;


public class TestChangeBaseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose input base (1: Binary, 2: Decimal, 3: Hexadecimal): ");
        int inputBase = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose output base (1: Binary, 2: Decimal, 3: Hexadecimal): ");
        int outputBase = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the input value: ");
        String inputValue = scanner.nextLine();

        ChangeBaseNumber cbn = new ChangeBaseNumber();

        try {
            int decimalValue = 0;
            String result = "";

            // Convert input to decimal
            switch (inputBase) {
                case 1:
                    decimalValue = cbn.binToDec(inputValue);
                    break;
                case 2:
                    decimalValue = Integer.parseInt(inputValue);
                    break;
                case 3:
                    decimalValue = cbn.hexToDec(inputValue);
                    break;
                default:
                    System.out.println("Invalid input base!");
                    return;
            }

            // Convert decimal to output base
            switch (outputBase) {
                case 1:
                    result = cbn.decToBin(decimalValue);
                    break;
                case 2:
                    result = String.valueOf(decimalValue);
                    break;
                case 3:
                    result = cbn.decToHex(decimalValue);
                    break;
                default:
                    System.out.println("Invalid output base!");
                    return;
            }

            System.out.println("Converted value: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input value! Please ensure it matches the selected input base.");
        } finally {
            scanner.close();
        }
    }
}
