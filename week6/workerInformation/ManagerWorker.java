
package week6.workerInformation;

import java.util.ArrayList;
import java.util.List;

public class ManagerWorker {
    Worker w = new Worker();
    private ArrayList<Worker> workers = new ArrayList<>();

    boolean checkID(String id){
        for (Worker worker: workers){
            if(id.equalsIgnoreCase(worker.getIdworker())){
                return true;
            }
        }
        return false;
    }
    
    public boolean addWorker(){
        String id = ValidationWeek6.getString("Enter id worker");
        if(checkID(id)){
            System.out.println("Id be existed in DB");
            return false;
        }
        Worker worker = new Worker();
        worker.input(id);
        workers.add(worker);
        return true;
    }

    public void displaySalaryHistory(){
        System.out.println("-------------------- Display Information Salary -----------------------");
        System.out.printf("| %-10s | %-10s | %-5s | %-10s | %-5s | %-12s |\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        for (Worker worker: workers){
            List<SalaryHistory> wsh = worker.getInformationSalaryHistories();
            for (SalaryHistory salaryHistory: wsh){
                System.out.printf("| %-10s | %-10s | %-5d | %-10s | %-5s | %-12s |\n",
                        worker.getIdworker(), worker.getNameWorker(), worker.getAge(),
                        salaryHistory.getAmount(), salaryHistory.getType(), salaryHistory.getDate());
            }
        }
    }

    Worker findWorkerById(String id) {
        for (Worker worker : workers) {
            if (worker.getIdworker().equalsIgnoreCase(id)) {
                return worker;
            }
        }
        return null;
    }

    public boolean upSalary(){
        String idUp = ValidationWeek6.getString("Enter id worker");
        Worker worker = findWorkerById(idUp);
        if(worker != null){
            worker.increase();
            return true;
        }
        return false;
    }

    public boolean downSalary(){
        String idUp = ValidationWeek6.getString("Enter id worker");
        Worker worker = findWorkerById(idUp);
        if(worker != null){
            worker.decrease();
            return true;
        }
        return false;
    }
}
