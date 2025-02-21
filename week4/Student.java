
package week4;

import java.io.IOError;


public class Student implements Comparable<Student>{
    private String ID;
    private String nameStudent;
    private int semester;
    private String nameCourse;

    public Student(String ID, String nameStudent, int semester, String nameCourse) {
        this.ID = ID;
        this.nameStudent = nameStudent;
        this.semester = semester;
        this.nameCourse = nameCourse;
    }

    public Student() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    @Override
    public int compareTo(Student o) {
        return this.getNameStudent().compareTo(o.getNameStudent());
//        return 

    }
    
    
    
//  public int compareTo(Student o){
//    }
    @Override
    public String toString() {
        return String.format("%-5s |%-15s |%-5d |%-5s", this.getID(), this.getNameStudent(), this.getSemester(), this.getNameCourse());
    }
    
    
  
}
