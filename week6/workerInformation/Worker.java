
package week6.workerInformation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Worker  {
    private String idworker;
    private String nameWorker;
    private int age;
    private double salary;
    private String locationWork;
    
    private ArrayList<SalaryHistory> salaryHistorys;

    public Worker() {
       this.salaryHistorys = new ArrayList<>();
    }

    public Worker(String idworker, String nameWorker, int age, double salary, String locationWork) {
        this.idworker = idworker;
        this.nameWorker = nameWorker;
        this.age = age;
        this.salary = salary;
        this.locationWork = locationWork;
    }


    public String getIdworker() {
        return idworker;
    }

    public void setIdworker(String idworker) {
        this.idworker = idworker;
    }

    public String getNameWorker() {
        return nameWorker;
    }

    public void setNameWorker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getLocationWork() {
        return locationWork;
    }

    public void setLocationWork(String locationWork) {
        this.locationWork = locationWork;
    }
    
    void input(String idWork){
        System.out.println("Let input data: ");
        this.setIdworker(idWork);
        this.setNameWorker(ValidationWeek6.getString("Enter name worker"));
        this.setAge(ValidationWeek6.checkAge("Enter age"));
        this.setSalary(ValidationWeek6.getSalary("Enter salary"));
        this.setLocationWork(ValidationWeek6.getString("Enter location work"));
    }

    
    boolean increase(){
        double s= ValidationWeek6.getSalary("Enter new salary");
        if(s> this.salary){
            SalaryHistory history = new SalaryHistory();
            history.salary(s);
            this.salaryHistorys.add(history);
            this.salary= s;
            return true;
        }
        return false;
    }
    
    boolean decrease(){
        double s= ValidationWeek6.getSalary("Enter new salary");
        if(s< this.salary){
            SalaryHistory history = new SalaryHistory();
            history.salary(s);
            this.salaryHistorys.add(history);
            this.salary= s;
            return true;
        }
        return false;
    }

    public List<SalaryHistory> getInformationSalaryHistories(){
        salaryHistorys.sort(Comparator.comparing(SalaryHistory::getDate));
            return salaryHistorys;

    }
    

    @Override
    public String toString() {
        return String.format("| %-10s | %-10s |%-5s |%-8s |%-10s", this.idworker, this.nameWorker,this.age, this.salary, this.locationWork);
    }
    
}

