package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Customer c1 = new Customer("Lars","Jensen" ,"Moister5414");
        Customer c2 = new Customer("Jorgen", "Hansen","TheGoat23");

        // 1.e
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(c1);
        customers.add(c2);

        // 1.f
        printCustomers(customers);

    }

    // 1.f
    static void printCustomers(ArrayList<Customer> customers){
        for(Customer c : customers){
            System.out.println(c);
        }

    }
}
