// ThisKeywordDemo.java

class Employee {
    String name;
    int id;

    // 1. Using 'this' to resolve variable shadowing
    Employee(String name, int id) {
        this.name = name; // 'this.name' refers to instance variable
        this.id = id;
    }

    // 2. Using 'this' to call another constructor (constructor chaining)
    Employee() {
        this("Default Name", 0); // calls the parameterized constructor
    }

    // 3. Using 'this' to call an instance method
    void showDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    void callShowUsingThis() {
        this.showDetails(); // optional, but shows use of 'this' to call a method
    }

    // 4. Using 'this' to pass the current object as argument
    void print(Employee emp) {
        System.out.println("Object passed: " + emp.name + " (" + emp.id + ")");
    }

    void callPrint() {
        print(this); // passing current object
    }

    // 5. Using 'this' to return the current object (method chaining)
    Employee updateName(String newName) {
        this.name = newName;
        return this;
    }

    Employee updateId(int newId) {
        this.id = newId;
        return this;
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Constructor with Shadowing Resolved ===");
        Employee emp1 = new Employee("Alice", 101);
        emp1.showDetails();

        System.out.println("\n=== 2. Constructor Chaining with this() ===");
        Employee emp2 = new Employee();
        emp2.showDetails();

        System.out.println("\n=== 3. Calling Method with this ===");
        emp1.callShowUsingThis();

        System.out.println("\n=== 4. Passing Object with this ===");
        emp1.callPrint();

        System.out.println("\n=== 5. Method Chaining with this ===");
        emp1.updateName("Bob").updateId(202).showDetails(); // chaining
    }
}
