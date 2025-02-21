
package week5.ManageCourse;

import java.time.LocalDate;
import java.util.ArrayList;


public class ManageCourse{
    private ArrayList<Course> courses;

    public ManageCourse() {
         this.courses = new ArrayList<>();
    }
    
    public void addCourse(){
        
        String choice = Validation.getString("Enter online/offline to add: (o/f)");

        
            switch(choice){
            case "o" ->{
                OnlineCourse onlineCourse = new OnlineCourse();
                System.out.println("BEfore");
                onlineCourse.inputAll();
                this.courses.add(onlineCourse); 

                
                return;
            }
            case "f" ->{
                OfflineCourse offlineCourse = new OfflineCourse();
                offlineCourse.inputAll();
                this.courses.add(offlineCourse);
                System.out.println("Add successful");
                return;
            }
            default ->{
                System.out.println("Data input is invalid");
            }
       
        }
    }
    
    public void updateCoure(String id){
        for(Course co : courses){
                if(co.getIdcourse().equalsIgnoreCase(id)){
                    co.toString();
                    update(co);
                    System.out.println("Update successfull");
                    return;
                }
        }
        String ques = Validation.getString("Not found id, do you want again ? (Y/N):");
        if(ques.equalsIgnoreCase("y")){
            updateCoure(Validation.getString("Enter id: "));
        }
        
    }
    
    public Course update(Course course){
        System.out.println("---------Updating----------");
        System.out.println("Note: Enter empty if you don't want to change it.");
        
        String id= Validation.getStringUpdate("Enter new id");
        if(!id.isEmpty()) course.setIdcourse(id);
        
        String namecourse = Validation.getStringUpdate("Enter new name course");
        if(!namecourse.isEmpty()) course.setCourse(namecourse);
        
        String credit = Validation.getStringUpdate("Enter  new credit");
        if(!credit.isEmpty()) {
            System.out.println("hhhhhhh");
            course.setCredits(Validation.getNum(credit));
        }
      
        if(course instanceof OnlineCourse){
            
            String plan = Validation.getStringUpdate("Enter new plantform");
            if(!plan.isEmpty()) ((OnlineCourse)course).setPlatform(plan);
            
            String ins = Validation.getStringUpdate("Enter new instructor: ");
            if(!ins.isEmpty()) ((OnlineCourse) course).setInstructors(ins);
            
        } else if(course instanceof OfflineCourse){
            LocalDate begin = Validation.getDateUpdate("Enter new begin", LocalDate.now());
            if(begin != null) ((OfflineCourse) course).setBegin(begin);
            
            LocalDate end = Validation.getDateUpdate("Enter new end", begin);
            if(end != null) ((OfflineCourse) course).setEnd(end);
            
            String campus = Validation.getStringUpdate("Enter new campus: ");
            if(!campus.isEmpty()) ((OfflineCourse) course).setCampus(campus);
        }
        return course;
    }
    
    public void delete(String id){
        for(Course co: courses){
            if(co.getIdcourse().equalsIgnoreCase(id)){
                co.toString();
                    String conf= Validation.getString("Reall want deleted: (y/n)");
                    if(conf.equalsIgnoreCase("y")){
                        courses.remove(co);
                        System.out.println("Deleted successful");
                    } else{
                        System.out.println("Deletion cancelled");
                    }
                    return;
            }
        }
        String ques = Validation.getString("Not found id, do you want again ? (Y/N):");
        if(ques.equalsIgnoreCase("y")){
            delete(Validation.getString("Enter id: "));
        }
    }
    
    public void printAll(){
        String choice = Validation.getString("Enter online/offline to print: (on/of)");
       
            switch(choice){
            case "on" ->{
                for (Course course : courses) {
                    if(course instanceof OnlineCourse){
                        System.out.println(course);
                    }
                }
            }
            case "of" ->{
                for (Course course : courses) {
                    if(course instanceof OfflineCourse){
                         System.out.println(course);
                    }
                }
            }
            default ->{
                System.out.println("Data input is invalid");
            }
     
        }
    }
    
    public void searchByName(String name){
        for (Course course : courses) {
            if(course.getCourse().equalsIgnoreCase(name)){
                System.out.println(course);
            }
        }
    }
}
