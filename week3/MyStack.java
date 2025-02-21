/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Stack;

public class MyStack {
    private Stack<Integer> stackInt;
    
    public MyStack() {
        stackInt = new Stack<>();
    }
    
    public void push(int n) {
        stackInt.push(n);
        System.out.println("Pushed: " + n);
    }
    
    public int pop() {
        if (!stackInt.isEmpty()) {
            int n = stackInt.pop();
            System.out.println("Popped: " + n);
            return n;
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
    
    public int get() {
        if (!stackInt.isEmpty()) {
            int n = stackInt.peek();
            System.out.println("Top value: " + n);
            return n;
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
}
