// This is the class that contains the addition method and the main method
public class BasicMethodExample {

    // This method performs addition of two numbers
    int addNumbers(int num1, int num2) {
        int sum = num1 + num2; // Add the two numbers
        return sum; // Return the result
    }

    // This is the main method — the entry point of the program
    public static void main(String[] args) {
        // Create an object of the BasicMethodExample class
        BasicMethodExample obj = new BasicMethodExample();

        // Call the addNumbers method and store the result
        int result = obj.addNumbers(10, 20);

        // Print the result
        System.out.println("Addition result: " + result);
    }
}
