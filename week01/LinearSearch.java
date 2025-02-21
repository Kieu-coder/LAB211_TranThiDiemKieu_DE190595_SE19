
package week01;

import java.util.Random;
import java.util.Scanner;


public class LinearSearch {
    Scanner scanner = new Scanner(System.in);
    private int[] array;


    public LinearSearch(int n) {
        this.array = new int[n];
    }
    
    void addValue(){
        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//           array[i] = random.nextInt(num);
//            System.out.print(array[i]);
//        }
        int[] randomValue = random.ints(array.length,0, array.length).toArray();
        
        System.arraycopy(randomValue, 0, array, 0, array.length);
    }
        
    void showArray(){
        System.out.print("Array: ");
        for(int c : array){
            System.out.print(c+"\t");
        }
        System.out.print("\n");
    }
    
    int searchValue(int n){
        for (int i = 0; i < array.length; i++) {
           if(array[i] == n){
               return i;
           }
        }
        return -1;
    }
    
    
}
