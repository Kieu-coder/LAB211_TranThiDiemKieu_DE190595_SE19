
package lab211_tranthidiemkieu_de190595_assignment;

import java.util.Scanner;
import week3.MangSoNguyen;


public class TestSortArrayWeek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MangSoNguyen mangSoNguyen = new MangSoNguyen(Utilizer.limitedNumber());
        mangSoNguyen.addValue();
        mangSoNguyen.showValue();
        mangSoNguyen.sortValue();
        mangSoNguyen.showValue();
    }
}
