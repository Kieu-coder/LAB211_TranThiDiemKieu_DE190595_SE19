
import lab211_tranthidiemkieu_de190595_assignment.Utilizer;
import week5.ManageCourse.ManageCourse;
import week5.ManageCourse.Validation;


public class TestManageCourseWeek5 {
    public static void main(String[] args) {
        ManageCourse manageCourse = new ManageCourse();
        int choice =0;
                
        
        while(choice!=7){

            System.out.println("      WELCOME TO MANAGEMENT COURSE");
            System.out.println("\t1. Add online course/ offline course");
            System.out.println("\t2. Update course");
            System.out.println("\t3. Delete course");
            System.out.println("\t4. Print all online course/ offline course");
            System.out.println("\t5. Search information base on course name");
            System.out.println("\t6. Existing");
            choice = Utilizer.addValue("Enter your choice: ");
            
            switch(choice){
                case 1 ->{
                    System.out.println("---------Add new course----------");
                    manageCourse.addCourse();
                    
                }
                case 2 ->{
                    System.out.println("-----------Update course----------");
                    manageCourse.updateCoure(Validation.getString("Enter id to search"));
                    
                }
                case 3 ->{
                    System.out.println("-----------Delete course----------");
                    manageCourse.delete(Validation.getString("Enter id want to delete"));
                }
                case 4 ->{
                    System.out.println("-----------Print course----------");
                    manageCourse.printAll();
                }
                case 5 ->{
                    System.out.println("-----------Search course----------");
                    manageCourse.searchByName(Validation.getString("Enter name want to search"));
                }
                case 6 ->{
                    System.out.println("-----------Existing----------");
                    return;
                }
                default-> System.out.println("Error");
            }
        }
        
        
    }
    
}
