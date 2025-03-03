
package week6.ContactManagement;


import week6.workerInformation.ValidationWeek6;

public class Contact {
    private int idContact;
    private String nameContract;
    private String group;
    private String phone;
    private String address;
    private String lastName;
    private String firstName;

    private static int count =1;
    public Contact(String nameContract, String group, String phone, String address) {
        this.idContact = count++;
        this.nameContract = nameContract;
        String[] namePart = nameContract.trim().split(" ",2);
        this.group = group;
        this.phone = phone;
        this.address = address;
        this.firstName = namePart[0];
        this.lastName = namePart.length >1 ? namePart[1] :"";
    }

    public Contact() {
    }
    
    public static void resetCount(int newCont){
        count = newCont;
    }
    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getNameContract() {
        return nameContract;
    }

    public void setNameContract(String nameContract) {
        this.nameContract = nameContract;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
}
