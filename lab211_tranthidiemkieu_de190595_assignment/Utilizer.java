
package lab211_tranthidiemkieu_de190595_assignment;

import java.util.Scanner;


public class Utilizer {
    static final Scanner scanner = new Scanner(System.in);
    static int addValueForSort(){
        while (true) {            
            try {
            System.out.println("Enter num element: ");
            int input = Integer.parseInt(scanner.next());
            return input;
            } catch (Exception e) {
                System.out.println("error");
            } 
        }
//        return 0;
    }
    
    public static int addValue(){
        while (true) {            
            try {
            System.out.println("Enter: ");
            int input = Integer.parseInt(scanner.next());
            return input;
            } catch (Exception e) {
                System.out.println("error");
            } 
        }
//        return 0;
    }
    
    
    public static int addValue(String msg){
        while (true) {            
            try {
                System.out.print(msg);
            int input = Integer.parseInt(scanner.nextLine().trim());
            return input;
            } catch (Exception e) {
                System.out.println("error");
            } 
        }
//        return 0;
    }
    
    public static String getString(String msg){
        System.out.print(msg);
         String mess = scanner.nextLine().trim();
        return mess;
        
    }
    
    public static String getString(){
         String mess = scanner.nextLine().trim();
         System.out.println("");
        return mess;
        
    }
    
    static int limitedNumber(){
        while (true) {            
            try {
                int n = addValueForSort();
                if (n>2) return n;
            } catch (Exception e) {
                
            }
            System.out.println("number less than 2");
        }
    }
}
