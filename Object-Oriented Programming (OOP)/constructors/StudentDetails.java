// StudentDetails.java

class Student {
    String studentName;
    int rollNumber;
    String course;

    // Parameterized constructor
    public Student(String name, int rollNo, String courseName) {
        studentName = name;
        rollNumber = rollNo;
        course = courseName;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println(); // For spacing between students
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Creating student objects using the parameterized constructor
        Student s1 = new Student("Alice Brown", 201, "Mathematics");
        Student s2 = new Student("Bob Green", 202, "Physics");
        Student s3 = new Student("Charlie Black", 203, "Chemistry");

        // Displaying details of each student
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
