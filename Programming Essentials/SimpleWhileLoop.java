// SimpleWhileLoop.java
// This program counts down from 5 to 1 using a while loop

public class SimpleWhileLoop {
    public static void main(String[] args) {
        int count = 5; // Start from 5

        // Loop while count is greater than 0
        while (count > 0) {
            System.out.println("Count: " + count);
            count--; // Decrease count by 1
        }

        System.out.println("Done!");
    }
}
