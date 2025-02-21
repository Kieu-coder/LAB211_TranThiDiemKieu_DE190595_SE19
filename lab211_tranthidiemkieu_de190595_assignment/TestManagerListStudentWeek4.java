
package lab211_tranthidiemkieu_de190595_assignment;

import java.util.List;
import week4.ListStudent;
import week4.Student;


public class TestManagerListStudentWeek4 {
    public static void main(String[] args) {
        ListStudent listStudent = new ListStudent();
        int choice =0;
        while(choice!=5){

            System.out.println("      WELCOME TO STUDENT MANAGEMENT");
            System.out.println("\t1. Create");
            System.out.println("\t2. Find and sort");
            System.out.println("\t3. Update/Delete");
            System.out.println("\t4. Report");
            System.out.println("\t5. Exit");
            choice = Utilizer.addValue("Enter your choice: ");
            
            switch(choice){
                case 1 ->{
                    
                    int count =0;
                    while(count<3){
                        listStudent.createStudent();
                        count++;
                    }
                    String ans= Utilizer.getString("Do you want to continue (Y/N)? ");
                    if(ans.equalsIgnoreCase ("y"))listStudent.createStudent();
                }
                case 2 ->{
                    listStudent.sort();
                    listStudent.findByName(Utilizer.getString("Enter name want to find: "));
                    
                }
                case 3 ->{
                    listStudent.updateOrDelete(Utilizer.getString("Enter id student: "));
                }
                case 4 ->{
                    listStudent.reportStudents();
                }
                case 5 ->{
                    System.out.println("Exiting program manager");
                    return;
                }
                default-> System.out.println("Error");
            }
        }
        
        
    }
}
