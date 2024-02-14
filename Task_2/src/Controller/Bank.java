package Controller;

import Model.Customer;
import Model.Customers_DataBase;

public class Bank {
    private Customers_DataBase  customersDataBase;
    private Login login;

    public Bank(Login  login) {
        customersDataBase = new Customers_DataBase();
        this.login = login;
    }

    public void deposit(float amount) {
        for (Customer customer : customersDataBase.getCustomers()) {
            if (customer.getUserName().equals(login.getUserName())) {
                customer.setBalance(customer.getBalance() + amount);
                System.out.println("Deposit successful");
                return;
            }
        }
        System.out.println("Deposit failed");
    }

    public void withdraw(float amount) {
        for (Customer customer : customersDataBase.getCustomers()) {
            if (customer.getUserName().equals(login.getUserName())) {
                if (customer.getBalance() >= amount) {
                    customer.setBalance(customer.getBalance() - amount);
                    System.out.println("Withdraw successful");
                    return;
                }
            }
        }
        System.out.println("Withdraw failed, not enough balance");
    }

    public void transfer(float amount, String recipientUserName) {
        for (Customer customer : customersDataBase.getCustomers()) {
            if (customer.getUserName().equals(login.getUserName())) {
                if (customer.getBalance() >= amount) {
                    boolean recipientFound = false;
                    for (Customer recipient : customersDataBase.getCustomers()) {
                        if (recipient.getUserName().equals(recipientUserName)) {
                            recipient.setBalance(recipient.getBalance() + amount);
                            System.out.println("Transfer successful");
                            customer.setBalance(customer.getBalance() - amount);
                            recipientFound = true;
                            return;
                        }
                    }
                    System.out.println("Transfer failed, recipient not found");
                    return;
                }
            }
        }
        System.out.println("Transfer failed, not enough balance");
    }

    public  void checkBalance() {
        for (Customer customer : customersDataBase.getCustomers()) {
            if (customer.getUserName().equals(login.getUserName())) {
                System.out.println("Your balance is: " + customer.getBalance());
                return;
            }
        }
    }
}
