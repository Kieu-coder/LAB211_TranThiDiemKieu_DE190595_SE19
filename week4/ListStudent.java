
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lab211_tranthidiemkieu_de190595_assignment.Utilizer;


public class ListStudent{
    private ArrayList<Student> students;
    Scanner scanner = new Scanner(System.in);

    public ListStudent() {
       this.students = new ArrayList<>();
    }
    
    
    public void createStudent(){

        String id = Utilizer.getString("Enter id: ");
        String name = Utilizer.getString("Enter name: ");
        int sem = Utilizer.addValue("Enter semester: ");
        String course = Utilizer.getString("Enter cours: ");
        if (checkId(id) == null){
            this.students.add(new Student(id, name, sem, course));
            System.out.println("Add successfull");
        } else System.out.println("This student been was existing");
    }
    
    public static void main(String[] args) {
        ListStudent listStudent = new ListStudent();
        listStudent.createStudent();
    }
    
    public void sort(){
        Collections.sort(students, Student::compareTo);
        System.out.println("\t     List students");
        for(Student student :students){
        System.out.println(student);
    }
//        students.forEach(System.out::println);
        
    }
    
    public List<Student> findByName(String name){
        int count=0;
        ArrayList<Student> st1 = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
           if(name.equalsIgnoreCase(students.get(i).getNameStudent())){
               st1.add(students.get(i));
               count++;
           }
        }
        System.out.println("Have: " + count + " name is " + name);
        return st1;
    }
    
    
    public boolean updateStudent(Student st){
        st.setNameStudent(Utilizer.getString("Enter new name: "));
        st.setSemester(Utilizer.addValue("Enter new semester: "));
        st.setNameCourse(Utilizer.getString("Enter new course: "));
        return true;
    }
    
    public Student checkId(String id){
        for (int i = 0; i < this.students.size(); i++) {
            if (id.equals(this.students.get(i).getID())) return students.get(i);
        }
        return null;
    }
    public void updateOrDelete(String id){
        Student student = checkId(id);
        if(checkId(id) == null){
            System.out.println("Not found student");
        } else{
            if(Utilizer.getString("Update/ delete: ").equalsIgnoreCase("Update")){
                updateStudent(student);
                System.out.println("Update successfull");
                return;
            }else if(Utilizer.getString("Update/ delete: ").equalsIgnoreCase("delete")){
                this.students.remove(student);
                System.out.println("Delete successfull");
            } else{
                System.out.println("Invalid");
            }
        }
    }
    
    public void reportStudents(){
        Map<String, Integer> ds = new HashMap<>();
        for(Student student: students){
            String key = student.getID() + "|" + student.getNameStudent() + "|" + student.getNameCourse();
            ds.put(key, ds.getOrDefault(key, 0) +1);
        }
        
        for (Map.Entry<String, Integer> infor: ds.entrySet()){
            System.out.println(infor.getKey() + "|" + infor.getValue());
        }
    }
}
