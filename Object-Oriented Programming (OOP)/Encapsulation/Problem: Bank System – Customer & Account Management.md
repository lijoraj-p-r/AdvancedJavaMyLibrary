
## ✅ **Problem: Bank System – Customer & Account Management**

### **Scenario:**

You're building a module for a **banking application**. Each **Customer** can have one or more **BankAccounts**. You must design the system using **encapsulation**, ensuring:

* Account balances cannot be directly accessed or changed from outside the class.
* Deposits and withdrawals must include validation.
* Only limited public methods should expose or modify internal state.

---

### 🧩 **Requirements:**

1. **Customer class** should store:

   * Customer ID
   * Name
   * List of BankAccounts

2. **BankAccount class** should include:

   * Account number
   * Balance (private)
   * Public methods: `deposit()`, `withdraw()`, `getBalance()`
   * Private helper methods if needed

3. Apply encapsulation by:

   * Making all fields private.
   * Providing getters/setters **only where necessary**.
   * Validating data before changes.

---

## 🧪 **Expected Behaviors:**

* A customer cannot set the balance directly.
* Deposit/withdraw should log invalid attempts (e.g., negative amounts or overdraft).
* You should be able to print a customer's account balances safely.

---

### ✅ **Java Code:**

```java
import java.util.ArrayList;
import java.util.List;

// BankAccount Class
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + accountNumber);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// Customer Class
class Customer {
    private String customerId;
    private String name;
    private List<BankAccount> accounts;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void printAccountSummary() {
        System.out.println("Customer: " + name);
        for (BankAccount account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + ": $" + account.getBalance());
        }
    }

    // Getters (no setters for sensitive fields)
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

// Main Class to Run
public class BankSystemApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("C001", "Alice Johnson");

        BankAccount acc1 = new BankAccount("A1001", 5000);
        BankAccount acc2 = new BankAccount("A1002", 3000);

        customer1.addAccount(acc1);
        customer1.addAccount(acc2);

        acc1.deposit(1500);
        acc2.withdraw(500);
        acc2.withdraw(5000);  // should show invalid

        customer1.printAccountSummary();
    }
}
```

---

### 🔐 **How Encapsulation Is Used:**

* `balance` is **private**: can’t be modified directly.
* Only public methods (`deposit`, `withdraw`, `getBalance`) can access it safely.
* `Customer` doesn't access or modify account balances directly — it uses methods.
* No public setters for sensitive fields (like `balance` or `accountNumber`).

