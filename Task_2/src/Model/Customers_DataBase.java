package Model;

import java.util.ArrayList;

public class Customers_DataBase {
    private final ArrayList<Customer> customers;

    public Customers_DataBase() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer("yehia", "1111", 1000));
        customers.add(new Customer("omnia", "2222", 2000));
        customers.add(new Customer("mohamed", "3333", 3000));
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
