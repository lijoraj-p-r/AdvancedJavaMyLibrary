// JumpStatementsExample.java
// Demonstrates break, continue, and return statements in Java

public class JumpStatementsExample {
    public static void main(String[] args) {
        System.out.println("Demonstrating break:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nDemonstrating continue:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the rest of the loop body when i is 3
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nDemonstrating return:");

        testReturn(5);
        testReturn(15);
    }

    // Method to demonstrate return statement
    static void testReturn(int number) {
        if (number < 10) {
            System.out.println("Number is less than 10, returning early.");
            return; // Exit method immediately
        }
        System.out.println("Number is " + number);
    }
}
