
package week6.ContactManagement;

import week6.workerInformation.ValidationWeek6;
import java.util.ArrayList;


public class ManagerContact {
    private ArrayList<Contact> contacts= new ArrayList<>();
    private Contact contact;

    public ManagerContact() {
//        this.contacts =new ArrayList<>();
    }

    public boolean addContact(){
        String name = ValidationWeek6.getName("Enter name contact");
        String group = ValidationWeek6.getString("Enter group");
        String address = ValidationWeek6.getString("Enter address");
        String phone = ValidationWeek6.checkPhoneNumber("Enter phone");
        this.contacts.add(new Contact(name,group,address,phone));
        return true;
    }


    public void displayContact(){
        System.out.println("-------------------- Display Infor Contact -----------------------");
        System.out.printf("| %-5s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (Contact contact: contacts){
            System.out.printf("| %-5s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                    contact.getIdContact(), contact.getNameContract(), contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(),  contact.getPhone(),contact.getAddress());
        }
        if(contacts.isEmpty()){
            System.out.println("List is Empty");
        }
    }


    public boolean deleteContact (){
        int id = ValidationWeek6.getNumber("Enter id contact want");
        for (Contact contact: contacts){
            if(id == contact.getIdContact()){
                this.contacts.remove(contact);
                
                for (int i = 0; i < contacts.size(); i++) {
                    contacts.get(i).setIdContact(i+1);
                }
                this.contact.resetCount(contacts.size() +1);
                
                return true;
            }
        }
        

        return false;
    }

}
