package lab211_tranthidiemkieu_de190595_assignment;

import week4.managerInformation.ManageInfor;

public class TestManageInforWeek4 {
    public static void main(String[] args) {
        ManageInfor manageInfor = new ManageInfor();
        int choice =0;
        while(choice!=5){
            System.out.println("      WELCOME TO MANAGEMENT INFORMATION");
            System.out.println("\t1. Enter n teachers");
            System.out.println("\t2. Print n teachers entered by year in the profession descending");
            System.out.println("\t3. Enter n students");
            System.out.println("\t4. Print n students entered by increasing year of admission");
            System.out.println("\t5. Enter the name of the person you want to search for and print information about that person including ID " +
                                "full name, phone number, year of birth, major by increasing year of birth descending");
            System.out.println("\t6. Exiting program");                   
            choice = Utilizer.addValue("Enter your choice: ");
            
            switch(choice){
                case 1 ->{
                    int n = Utilizer.addValue("Enter n teacher to add:");
                    int count =0;
                    while(count<n){
                        manageInfor.addTeacher();
                        count++;
                    }
                }
                case 2 ->{
                    manageInfor.printTeachersByYearPro();
                }
                case 3 ->{
                    int n = Utilizer.addValue("Enter n student to add:");
                    int count =0;
                    while(count<n){
                        manageInfor.addStudent();
                        count++;
                    }                }
                case 4 ->{
                    manageInfor.printStudentsByYearOfAdmission();
                }
                case 5 ->{
                    String name = Utilizer.getString("Enter name you want to search");
                    manageInfor.searchByName(name);
                }
                case 6 ->{
                    System.out.println("Exiting program manager");
                    return;
                }
                default-> System.out.println("Error");
            }
        }
        
        
    }
}
