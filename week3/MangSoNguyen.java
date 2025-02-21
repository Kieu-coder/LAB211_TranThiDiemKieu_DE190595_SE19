/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

public class MangSoNguyen {
    private int[] array;

    public MangSoNguyen(int m) {
        this.array = new int[m];
    }
    
    public void addValue (){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            this.array[i] = random.nextInt(this.array.length);   
        }
    }
    
    public void showValue(){
        System.out.println("Elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(this.array[i]+"");
            
        }
        System.out.println("");
    }
    
    public void sortValue(){
        boolean check = false;
        for (int i = 0; i < array.length-1&& !check; i++) {
            check = true;
            for (int j = 0; j < array.length-i-1 ; j++) {
                if(this.array[j] > this.array[j+1]){
                    int temp = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = temp;
                    check = false;
                } 
                
            }
            
        }
    }
}
