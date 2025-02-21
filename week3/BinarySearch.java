/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;


public class BinarySearch {
    
     private int[] array;

    public BinarySearch(int m) {
        this.array = new int[m];
    }
    
    public void addValue(){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            this.array[i] = random.nextInt(this.array.length*10);
        }
    }
    
    public void showValue(){
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
     public void sort(){
        quickSort(this.array, 0, this.array.length -1);
    }
     
     public int[] sorted(){
        quickSort(this.array, 0, this.array.length -1);
        return this.array;
     }
    
    public void quickSort(int[]array, int first, int end){
        if(first< end){
            int privot= partition(array, first, end);
            quickSort(array, first, privot -1);
            quickSort(array, privot , end);
        }
    }
    
    public int partition(int[] array, int first, int end){
        int privot = array[first + (end-first)/2];
        int i = first, j= end;
        while(i<=j){
            while(array[i] < privot){
                i++;
            }
            while(array[j]> privot){
                j--;
            }
            if (i<=j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
    
    public void swap(int[] array, int i, int j){
       int temp = array[i];
       array[i] = array[j];
       array[j] = temp;
    }
    
    public int findNumber(int num){
        return findNumSorted(sorted(), 0, this.sorted().length-1, num);
    }
    
    public int findNumSorted(int[]array, int first, int end, int num){
        while(first<= end){
            int privot= first + (end-first)/2;
            if(array[privot] == num) {
                return privot; 
            }
            if (array[privot] < num) {
                first = privot + 1; 
            } else {
                end = privot - 1; 
            }
//            findNumSorted(sorted(), first, privot -1, num);
//            findNumSorted(sorted(), privot , end, num);
        }
        return -1;
    }
    
    

}
