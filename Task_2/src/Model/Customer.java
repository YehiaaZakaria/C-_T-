package Model;

public class Customer {
    private final String userName;
    private final String password;
    private float balance;

    public Customer(String userName, String password,  float balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
