import Controller.Bank;
import Controller.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Application!");
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice:");
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter your username: ");
                    String userName = in.nextLine();
                    System.out.print("Enter your password: ");
                    String password = in.nextLine();
                    Login login = new Login(userName, password);
                    if (login.login()) {
                        Bank bank = new Bank(login);
                        do {
                            System.out.println("Please select an option:");
                            System.out.println("1. Deposit");
                            System.out.println("2. Withdraw");
                            System.out.println("3. Transfer");
                            System.out.println("4. Check Balance");
                            System.out.println("5. log out");
                            System.out.print("Enter your choice:");
                            choice = in.nextInt();
                            in.nextLine();
                            switch (choice) {
                                case 1:
                                    System.out.print("Enter the amount to deposit: ");
                                    float amount = in.nextFloat();
                                    bank.deposit(amount);
                                    break;
                                case 2:
                                    System.out.print("Enter the amount to withdraw: ");
                                    amount = in.nextFloat();
                                    bank.withdraw(amount);
                                    break;
                                case 3:
                                    System.out.print("Enter the amount to transfer: ");
                                    amount = in.nextFloat();
                                    in.nextLine( );
                                    System.out.print("Enter the recipient's username: ");
                                    String recipientUserName = in.nextLine();
                                    bank.transfer(amount, recipientUserName);
                                    break;
                                case 4:
                                    bank.checkBalance();
                                    break;
                                case 5:
                                    System.out.println("Logging out...");
                            }
                        }while (choice != 5) ;
                    }
                    break;
                case 2:
                    System.out.println("Thank you for using the Bank Application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }while (choice != 2);
    }
}