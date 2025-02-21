
package week01;

import java.util.Random;

public class Array {
    private int[] array; 
    private Random random;

    public Array(int[] array, Random random) {
        this.array = array;
        this.random = random;
    }

    public Array() {
    }
    
    public void addArray(){
        
    }
    
    public int[] generateArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
    
    public void Display(int[] array){
        System.out.println("Array: ");
        for(int num: array){
            System.out.print(num+ " ");
        }
    }
    
    public int linearSearch(int[] array, int searchValue){
        //
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] == searchValue){
                return i;
            }
        }
        return -1;
    }
}
