// Class representing a bank account
class BankAccount {
    private double balance;  // private field for encapsulation

    // Deposit money into account
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1500);  // Deposit 1500
        System.out.println("Balance: " + account.getBalance());  // Output balance
    }
}
