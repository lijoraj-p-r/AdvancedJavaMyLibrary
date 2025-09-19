// Topic: EmployeeManagementEncapsulationProblem
public class Employee {
    public int id;                     // ❌ Public field - directly modifiable
    public String name;               // ❌ No control over assignment (e.g., null or empty)
    public double salary;             // ❌ No validation or access restriction

    public void assignDetails(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;           // ❌ No validation for negative or zero salary
    }

    public void giveRaise(double amount) {
        salary += amount;             // ❌ No check on amount; could result in invalid salary
    }
}

// ✅ Proper Encapsulation for application-level use
class Employee {
    private final int id;                     // ✅ Immutable once assigned
    private String name;                      // ✅ Controlled via setter
    private double salary;                    // ✅ Private with validation

    public Employee(int id, String name, double initialSalary) {
        if (id <= 0) throw new IllegalArgumentException("Invalid ID");
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        if (initialSalary < 30000) throw new IllegalArgumentException("Salary below minimum wage");

        this.id = id;
        this.name = name.trim();
        this.salary = initialSalary;
    }

    public int getId() {
        return id;                             // ✅ Read-only access
    }

    public String getName() {
        return name;                           // ✅ Getter for name
    }

    public void setName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.name = newName.trim();        // ✅ Setter with validation
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public double getSalary() {
        return salary;                         // ✅ Read-only access for salary
    }

    public void applyRaise(double percentage) {
        if (percentage <= 0 || percentage > 50) {
            throw new IllegalArgumentException("Raise must be between 0 and 50%");
        }
        double raiseAmount = salary * (percentage / 100);
        this.salary += raiseAmount;            // ✅ Salary updated via business logic only
    }
}
