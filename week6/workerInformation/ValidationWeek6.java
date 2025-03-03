package week6.workerInformation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationWeek6 {
    final static Scanner scanner = new Scanner(System.in);

    public static String getString(String msg){
        while (true) {
            System.out.print(msg+": ");

            String num = (scanner.nextLine().trim());
            if(!num.matches("")){
                return num;
            } else System.err.println("Please enter again. ");
        }
    }

    public static String checkIdWorker(String msg, String idworker){

        while (true){
            String id = getString(msg);
            if (!id.equalsIgnoreCase(idworker)) return id;
            System.out.println("Id be duplicated");
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

    public static int checkAge(String msg){
        while (true){
            int age = getNumber(msg);
            if (18<= age && age<= 50) return age;
            System.out.println("Age must be in range 18 to 50");
        }
    }
    
        public static double getSalary(String msg){
        while (true) {
            System.out.print(msg+": ");
            double num = Double.parseDouble(scanner.nextLine());
            if(0<= num){
                return num;
            } else System.err.println("Data input is invalid");
        }
    }
        
        public static LocalDate getDateUpdate(String msg){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            while(true){
                try{
                    System.out.print(msg+": ");
                    String inputDate = scanner.nextLine().trim();
                    if(inputDate != null) {
                        LocalDate r = LocalDate.parse(inputDate, formatter);
                        return r;
                    }
                }catch (DateTimeParseException e){
                    System.err.println("Input unvalid");
                }
            }
 
        }
        
    public static String getType(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String name = (scanner.nextLine().trim());
            if(name.equalsIgnoreCase("up") ||name.equalsIgnoreCase("down")){
                return name;
            } else System.err.println("Please enter again. ");
        }
    }
    
    public static String getName(String msg){
        while (true) {            
            System.out.print(msg+": ");
            String name = (scanner.nextLine().trim());
            if(name.matches("[a-zA-Z ]+") || name!= null){
                return name;
            } else System.err.println("Please enter again. ");
        }  
    }
    
    private static final String PHONE_REGEX ="^(\\d{10}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}(?:\\s*(?:x|ext)\\d{1,5})?)$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);
    
    public static String checkPhoneNumber(String msg){
        String[] testNumbers = {
                "1234567890",
                "123-456-7890",
                "123-456-7890 x1234",
                "123-456-7890 ext1234",
                "123.456.7890",
                "123 456 7890",
                "123-456-789O",
                "(123) 456-7890"
        };
         while (true) {            
            System.out.print(msg+": ");
            String number = (scanner.nextLine().trim());
            if(number != null){
                Matcher matcher = PHONE_PATTERN.matcher(number);
                if(matcher.matches()){
                    return number;
                } else {
                    System.out.println( "Valid formats include"); 
                    for(String valid : testNumbers){
                        System.out.println("" + valid);
                    }
                    System.out.println("Please enter again.");
                }
            } else System.err.println("Please enter again. ");
        }
    }


}
