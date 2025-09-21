// ShadowingExample.java

class Student {
    String name;
    int rollNumber;

    // Constructor with shadowing problem
    public Student(String name, int rollNumber) {
        // These lines have shadowing issue:
        name = name;
        rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name);              // will print null
        System.out.println("Roll Number: " + rollNumber); // will print 0
    }
}

class FixedStudent {
    String name;
    int rollNumber;

    // Corrected constructor using 'this'
    public FixedStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class ShadowingExample {
    public static void main(String[] args) {
        System.out.println("=== Shadowing Problem ===");
        Student s1 = new Student("Alice", 101);
        s1.display(); // Outputs: null, 0

        System.out.println("\n=== Fixed with this ===");
        FixedStudent s2 = new FixedStudent("Bob", 102);
        s2.display(); // Outputs: Bob, 102
    }
}
