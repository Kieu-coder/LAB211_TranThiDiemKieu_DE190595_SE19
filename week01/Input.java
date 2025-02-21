
package week01;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public Input() {
    }
    
    public int ArraySize(){
        System.out.println("Enter the number of array elements: ");
        int size = scanner.nextInt();
        
        while(size<=0){
            System.out.println("Please enter a positive number.");
            System.out.println("Enter the number of array elments: ");
            size = scanner.nextInt();
        }
        return size;
    }
    
    public int SearchValue(){
        System.out.println("Enter the search value: ");
        return scanner.nextInt();
    }
}
