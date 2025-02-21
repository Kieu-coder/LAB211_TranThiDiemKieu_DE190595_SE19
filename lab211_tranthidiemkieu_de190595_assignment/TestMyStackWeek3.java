/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab211_tranthidiemkieu_de190595_assignment;

import java.util.Scanner;
import week3.MyStack;

/**
 *
 * @author ASUS
 */
public class TestMyStackWeek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack myStack = new MyStack();
        
        while (true) {
            System.out.println("Choose an operation: 1. Push 2. Pop 3. Get 4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a value to push: ");
                    int number = scanner.nextInt();
                    myStack.push(number);
                }
                case 2 -> myStack.pop();
                case 3 -> myStack.get();
                case 4 -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
}
