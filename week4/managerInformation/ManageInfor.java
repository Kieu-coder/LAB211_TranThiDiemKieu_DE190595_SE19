
package week4.managerInformation;

import java.util.ArrayList;


public class ManageInfor {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public ManageInfor() {
 
    }
    
    public void addTeacher(){
        Teacher teacher = new Teacher();
        teacher.inputAll();
        this.teachers.add(teacher);
        System.out.println("Added successfull");
    }
    
    public void addStudent(){
        Student student = new Student();
        student.inputAll();
        this.students.add(student);
        System.out.println("Added successfull");
    }
    
    public void printTeachersByYearPro() {
        System.out.println("Teachers sorted by years in the profession:");
        teachers.sort((t1, t2) -> t2.getYp() - t1.getYp());  
        teachers.forEach(System.out::println); 
    }

    public void printStudentsByYearOfAdmission() {
        System.out.println("Students sorted by year of admission");
        students.sort((s1, s2) -> s1.getYoAdmission() - s2.getYoAdmission()); 
        students.forEach(System.out::println);  
    }

    public void searchByName(String name) {
        ArrayList<Person> foundPersons = new ArrayList<>();
        foundPersons.addAll(teachers);
        foundPersons.addAll(students);
        
        foundPersons.removeIf(p -> !p.getFullName().equalsIgnoreCase(name));
        
        if (foundPersons.isEmpty()) {
            System.out.println("No person found with the name: " + name);
        } else {
            foundPersons.sort((p1, p2) -> p2.getYob() - p1.getYob());  
            System.out.println("Search results:");
            foundPersons.forEach(p -> System.out.println(p));
        }
    }
}
