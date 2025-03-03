package lab211_Tranthidiemkieu_de190595_assignment2;

import lab211_tranthidiemkieu_de190595_assignment.Utilizer;
import week6.ContactManagement.ManagerContact;

public class TestContactManageWeek6 {

    public static void main(String[] args) {
        ManagerContact managerContact = new ManagerContact();
        int choice =0;


        while(choice!=4){

            System.out.println("      Contact program ");
            System.out.println("\t1. Add a Contact");
            System.out.println("\t2. Display information Contact");
            System.out.println("\t3. Delete a Contact");
            System.out.println("\t4. Existing");
            choice = Utilizer.addValue("Enter your choice: ");

            switch(choice){
                case 1 ->{
                    System.out.println("---------Add a Contact----------");
                    if(managerContact.addContact()) {
                        System.out.println("Add successful");
                    } else System.out.println("Don't add");

                }
                case 2 ->{
                    managerContact.displayContact();
                }
                case 3 ->{
                    System.out.println("-----------Delete Contact----------");
                    if(managerContact.deleteContact()) {
                        System.out.println("Deleted successful");
                    } else System.out.println("Deleted fail");
                }

                case 4 ->{
                    System.out.println("-----------Existing----------");
                    return;
                }
                default-> System.out.println("Error");
            }
        }


    }
}

