
package lab211_tranthidiemkieu_de190595_assignment;

import week3.QuickSort;


public class TestQuickSortWeek3 {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(Utilizer.limitedNumber());
        quickSort.addValue();
        System.out.println("Array before sort: ");
        quickSort.showValue();
        
        System.out.println("After sort: ");
        quickSort.sort();
        quickSort.showValue();
        
    }
    
}
