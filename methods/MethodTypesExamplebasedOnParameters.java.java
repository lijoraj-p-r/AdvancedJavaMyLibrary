// This class demonstrates all 4 types of methods in Java
public class MethodTypesExamplebasedOnParameters {

    // 1. Method without parameters and without return value
    void greet() {
        System.out.println("Hello, everyone!"); // Just prints a greeting
    }

    // 2. Method with parameters but without return value
    void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum); // Prints the sum of two numbers
    }

    // 3. Method without parameters but with return value
    int getNumber() {
        return 42; // Returns a fixed number
    }

    // 4. Method with parameters and with return value
    int multiply(int a, int b) {
        return a * b; // Returns the product of two numbers
    }

    // Main method to test all the above
    public static void main(String[] args) {
        // Create an object of the class to call non-static methods
        MethodTypesExample obj = new MethodTypesExample();

        // 1. Call method without parameters and return value
        obj.greet();

        // 2. Call method with parameters and no return value
        obj.printSum(10, 20);

        // 3. Call method without parameters but with return value
        int number = obj.getNumber();
        System.out.println("Returned number: " + number);

        // 4. Call method with parameters and with return value
        int product = obj.multiply(6, 7);
        System.out.println("Product: " + product);
    }
}
