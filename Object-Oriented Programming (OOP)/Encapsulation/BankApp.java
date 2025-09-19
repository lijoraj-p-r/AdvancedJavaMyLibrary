// Encapsulation is a fundamental principle of Object-Oriented Programming (OOP) that restricts direct access
// to certain components of an object and only allows interaction through well-defined methods. This improves
// security, reduces complexity, and helps in maintaining the integrity of the object. 

// In the code below, we encapsulate the balance field by making it private. Access to this balance is only allowed 
// via public getter and setter methods, ensuring that it can be safely updated or accessed.

class CustomerBankAccount {
    // The balance is private to protect it from direct modification.
    private double balance = 10000; // Balance is private (safe)

    // Getter method to read the balance (safe access)
    public double getBalance() {
        return balance;
    }

    // Setter method to update the balance safely
    public void setBalance(double amount) {
        if (amount > 0) { // Check to allow only positive amounts
            balance = amount;
        } else {
            System.out.println("Invalid amount!"); // Reject negative amounts
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        CustomerBankAccount account = new CustomerBankAccount();

        // Read balance using the getter method
        System.out.println("Current Balance: $" + account.getBalance()); 

        // Update balance using the setter method safely
        account.setBalance(15000); 
        System.out.println("Updated Balance: $" + account.getBalance());

        // Attempting to set a negative balance, which will be rejected
        account.setBalance(-5000); 
    }
}
