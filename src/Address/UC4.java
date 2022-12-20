package Address;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class UC4 {
    /**
     * create contact is a function in which we add the contact details
     * seeking input from user and printing back details
     * returning person details
     *
     * @return array list
     * iterator helps to set or replace value
     */
    public static ArrayList<String> createContact() {
        ArrayList<String> personDetails = new ArrayList<String>(1);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First name : ");
        String fname = input.nextLine();

        System.out.print("Enter the Last name : ");
        String lname = input.nextLine();

        System.out.print("Enter the Address : ");
        String address = input.nextLine();

        System.out.print("Enter the City : ");
        String city = input.nextLine();

        System.out.print("Enter the state : ");
        String state = input.nextLine();

        System.out.print("Enter the Zip Code : ");
        String zip = input.nextLine();

        System.out.print("Enter the phone number: ");
        String phone = input.nextLine();

        System.out.print("Enter the Email: ");
        String email = input.nextLine();

        personDetails.add(fname);
        personDetails.add(lname);
        personDetails.add(address);
        personDetails.add(city);
        personDetails.add(state);
        personDetails.add(zip);
        personDetails.add(phone);
        personDetails.add(email);

        for (String str : personDetails) {
            System.out.println(str + " ");
        }
        return personDetails;
    }

    /**
     * created a function to edit the details from the console.
     * Using Iterator to, edit an element
     *
     * @param personDetail
     */
    public static void editContact(ArrayList<String> Contact1) {
        ListIterator<String> iterator = Contact1.listIterator();
        System.out.println("Enter old value");
        Scanner input = new Scanner(System.in);
        String originalValue = input.nextLine();
        System.out.println("Enter new value");
        String value = input.nextLine();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(originalValue)) {
                //Replace element
                iterator.set(value);
            }
        }
        for (String str : Contact1) {
            System.out.println(str + " ");
        }
    }

    /**
     * all functions are passes in main function to perform .
     * Using Iterator can be to, traverse or obtain or remove elements
     *
     * @param args
     */

    public static void deleteContact(ArrayList<String> Contact1) {
        Iterator itr = Contact1.iterator();
        System.out.println("Enter value to delete");
        Scanner input = new Scanner(System.in);
        String deleteValue = input.nextLine();
        while (itr.hasNext()) {
            String x = (String) itr.next();
            if (x.equals(deleteValue))
                itr.remove();
        }
        for (String str : Contact1) {
            System.out.println(str + " ");
        }
    }

    /**
     * all functions are passes in main function to perform .
     * Printing welcome statement
     * taking user option from edit or create a contact and performing same
     * when user chooses create contacting , creatContact function performs
     * when user chose to edit contact, editContact will function perform
     * when user chose to delete contact, deleteContact function will perform
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome in Address Book");
        ArrayList<String> Contact1 = createContact();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First name : ");
        String fname = input.nextLine();
        System.out.print("What you want to perform ? Press 1 for Add the details , press 2 for edit the details , press 3 for edit the details : ");
        int option = input.nextInt();
        // giving option to user to create or edit or delete contact
        switch (option) {
            case 1:
                createContact();
                break;
            case 2:
                editContact(Contact1);
            case 3:
                deleteContact(Contact1);
                break;
            default:
                System.out.print("Please enter the valid number : ");
        }
    }
}