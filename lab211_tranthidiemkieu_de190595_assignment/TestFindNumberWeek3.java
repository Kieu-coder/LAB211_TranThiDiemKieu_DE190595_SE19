
package lab211_tranthidiemkieu_de190595_assignment;

import week3.BinarySearch;
import week3.QuickSort;


public class TestFindNumberWeek3 {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(Utilizer.limitedNumber());
        
     binarySearch.addValue();
        System.out.println("After sort: ");
        binarySearch.sort();
        binarySearch.showValue();
        
        int num = Utilizer.addValueForSort();
       
        int n= binarySearch.findNumber(num);
        System.out.println("Index for " + num+ ": " + n);
        
        
    }
}
