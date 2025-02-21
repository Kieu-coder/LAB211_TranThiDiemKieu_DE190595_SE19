
package week5.ManageCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Validation {
    public static final Scanner scanner = new Scanner(System.in);
    
    public static String getString(String msg){
        while (true) {            
            System.out.println(msg+": ");
            
            String num = (scanner.nextLine().trim());
            if(!num.matches("")){
                return num;
            } else System.err.println("Please enter again. ");
        }
    }
    
     public static String getStringNoCheck(String msg){ 
         System.out.println(msg+": ");
            String num = (scanner.nextLine().trim());
           if(num.matches("")){
                return null; }
           return num;
    }
    
    public static String getStringUpdate(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String num = (scanner.nextLine().trim());
            return num;
        }
    }
    
      public static String getName(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String name = (scanner.nextLine().trim());
            if(name.matches("[a-zA-Z ]+")){
                return name;
            } else System.err.println("Please enter again. ");
        }
    }
      
       public static int  getCredits(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String input = scanner.nextLine().trim();
            try {
                int c = Integer.parseInt(input);
                if(c > 0){
                return c;
            } else System.err.println("Please enter again. ");
            } catch (Exception e) {
                System.err.println("Invalid input");
            }
        }
    }
       
       
        public static int getNumber(String msg){
        while (true) {            
            System.out.print(msg+": ");
            int num = Integer.parseInt(scanner.nextLine());
            if(0<= num){
                return num;
            } else System.err.println("Data input is invalid");
        }
    }
        public static int getNum(String msg){
        while (true) {            
            int num = Integer.parseInt(msg);
            if(0<= num){
                return num;
            } else System.err.println("Data input is invalid");
        }
    }
        
             
        public static int getNumberUpdate(String msg){
        while (true) {            
            System.out.print(msg+": ");
            Integer num = Integer.parseInt(scanner.nextLine());
            if(num == null) return num;
            if(0<= num){
                return num;
            } else System.err.println("Data input is invalid");
        }
    }
        
       public static LocalDate getDate(String msg, LocalDate date){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            while(true){
                try{
                    System.out.println(msg);
                    String inputDate = scanner.nextLine().trim();
                    LocalDate r = LocalDate.parse(inputDate, formatter);
                    if(r.isAfter(date)){
                        return r;
                    }
                }catch (DateTimeParseException e){
                    System.err.println("Input unvalid");
                }
            }
 
        }
         
       
          public static LocalDate getDateUpdate(String msg, LocalDate date){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            while(true){
                try{
                    System.out.println(msg);
                    String inputDate = scanner.nextLine().trim();
                    if(inputDate == null) return null;
                    LocalDate r = LocalDate.parse(inputDate, formatter);
                    if(r.isAfter(date)){
                        return r;
                    }
                }catch (DateTimeParseException e){
                    System.err.println("Input unvalid");
                }
            }
 
        }
         public static int getScore(String msg){
        while (true) {            
            System.out.print(msg+": ");
            int num = Integer.parseInt(scanner.nextLine());
            if(0<= num && num <= 100 ){
                return num;
            } else System.err.println("Data input is invalid");
        }
    }
}
