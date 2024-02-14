package Controller;

import Model.Customer;
import Model.Customers_DataBase;

public class Login {
    private String userName;
    private String password;
    private Customers_DataBase  customersDataBase = new Customers_DataBase();
    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean login() {
        for (Customer customer : customersDataBase.getCustomers()) {
            if (customer.getUserName().equals(userName) && customer.getPassword().equals(password)) {
                System.out.println("Login successful");
                return true;
            }
        }
        System.out.println("Login failed");
        return false;
    }
}
