
package week4.managerInformation;

import java.util.Scanner;


public class Validation {
    public static final Scanner scanner = new Scanner(System.in);
    
    public static String getId(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String num = (scanner.nextLine().trim());
            if(num.matches("\\d{6}")){
                return num;
            } else System.out.println("Please enter again. ");
        }
    }
    
      public static String getName(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String name = (scanner.nextLine().trim());
            if(name.matches("[a-zA-Z ]+")){
                return name;
            } else System.out.println("Please enter again. ");
        }
    }
      
     public static String getPhone(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String num = (scanner.nextLine().trim());
            if(num.matches("\\d{12}")){
                return num;
            } else System.out.println("Please enter again. ");
        }
    }
     
      public static int getYear(String msg){
        while (true) {            
            System.out.print(msg+": ");
            int num = Integer.parseInt(scanner.nextLine());
            if(1900 <num && num < 2025){
                return num;
            } else System.out.println("Please enter again. ");
        }
    }
      
       public static String getMajor(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String major = (scanner.nextLine().trim());
            if(major.length() <=30){
                return major;
            } else System.out.println("Please enter again. ");
        }
    }
       
       public static int getYearProfession(String msg, int yob){
        while (true) {            
            System.out.print(msg+": ");
            int num = Integer.parseInt(scanner.nextLine());
            if(0<= num && num < (2025 - yob) ){
                return num;
            } else System.out.println("Data input is invalid");
        }
    }
       
       public static String getContractType (String msg){
           while (true) {            
            System.out.print(msg+": ");
            String type = (scanner.nextLine().trim());
            if(type.equalsIgnoreCase("Long") || type.equalsIgnoreCase("short")){
                return type;
            } else System.out.println("Data input is invalid");
        }
    }
       
        public static int getNumber(String msg){
        while (true) {            
            System.out.print(msg+": ");
            int num = Integer.parseInt(scanner.nextLine());
            if(0<= num){
                return num;
            } else System.out.println("Data input is invalid");
        }
    }
        
         public static int getYearAd(String msg, int yob){
        while (true) {            
            System.out.print(msg+": ");
            int num = Integer.parseInt(scanner.nextLine());
            if(yob< num && num <= 2025 ){
                return num;
            } else System.out.println("Data input is invalid");
        }
    }
         
         public static int getScore(String msg){
        while (true) {            
            System.out.print(msg+": ");
            int num = Integer.parseInt(scanner.nextLine());
            if(0<= num && num <= 100 ){
                return num;
            } else System.out.println("Data input is invalid");
        }
    }
}
