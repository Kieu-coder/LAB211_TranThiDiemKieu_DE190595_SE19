package lab211_Tranthidiemkieu_de190595_assignment2;

import lab211_tranthidiemkieu_de190595_assignment.Utilizer;
import week5.ManageCourse.Validation;
import week6.workerInformation.ManagerWorker;

public class TestWorkerInformationWeek6 {
    public static void main(String[] args) {
        ManagerWorker managerWorker = new ManagerWorker();
        int choice =0;


        while(choice!=7){

            System.out.println("      WORKER MANAGEMENT ");
            System.out.println("\t1. Add work");
            System.out.println("\t2. Up salary");
            System.out.println("\t3. Down salary");
            System.out.println("\t4. Display information salary");
            System.out.println("\t5. Existing");
            choice = Utilizer.addValue("Enter your choice: ");

            switch(choice){
                case 1 ->{
                    System.out.println("---------Add new Worker----------");
                    if(managerWorker.addWorker()) {
                        System.out.println("Add successful");
                    } else System.out.println("Don't add");

                }
                case 2 ->{
                    System.out.println("-----------Up Salary----------");
                    if(managerWorker.upSalary()) {
                        System.out.println("Up salary successful");
                    } else System.out.println("Up fail");
                }
                case 3 ->{
                    System.out.println("-----------Down salary----------");
                    if(managerWorker.downSalary()) {
                        System.out.println("Down salary successful");
                    } else System.out.println("Down fail");
                }
                case 4 ->{
                    managerWorker.displaySalaryHistory();
                }
                case 5 ->{
                    System.out.println("-----------Existing----------");
                    return;
                }
                default-> System.out.println("Error");
            }
        }


    }
}

