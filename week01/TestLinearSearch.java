
package week01;

import java.util.Scanner;


public class TestLinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array");
        LinearSearch linearSearch = new LinearSearch(scanner.nextInt());
        
        linearSearch.addValue();
        
        linearSearch.showArray();
        System.out.print("Search: ");
        
        System.out.println(linearSearch.searchValue(scanner.nextInt()));
        
        
        
        
    }
    
}
