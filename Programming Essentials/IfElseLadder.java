// IfElseLadder.java
// This program uses an if-else ladder to grade a student based on marks

public class IfElseLadder {
    public static void main(String[] args) {
        int marks = 85;  // Change this value to test different marks

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F - Fail");
        }
    }
}
