// ConstructorExample.java
public class ConstructorExample {
    String name;
    int age;

    // Default constructor
    ConstructorExample() {
        this("Unknown", 0); // Calls parameterized constructor
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Object with default constructor
        ConstructorExample person1 = new ConstructorExample();
        person1.display();

        System.out.println("------------------------");

        // Object with parameterized constructor
        ConstructorExample person2 = new ConstructorExample("Alice", 25);
        person2.display();
    }
}
