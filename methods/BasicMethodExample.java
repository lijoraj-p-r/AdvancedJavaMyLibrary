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


/*
-------------------------------------
📝 Method Components Explained (from KodNest)
-------------------------------------

1. Access Modifier (e.g., public, private):
   - Controls who can access the method.
   - Think of it as a key to a door—who is allowed to enter?
   - Example: `public` makes it accessible from anywhere.

2. Return Type (e.g., void, int, String):
   - Defines what type of value the method returns.
   - If no return value is needed, use `void`.

3. Method Name (e.g., sayHello, addNumbers):
   - A descriptive name to refer to the method.
   - Should reflect what the method does.

4. Parameters (e.g., int num1, int num2):
   - Inputs you pass into the method.
   - Think of them as ingredients for the task.
   - Can be empty `()` if no input is needed.

💡 Why Are Methods So Powerful?
   - Reuse: Write once, use multiple times.
   - Organization: Keeps code clean and readable.
   - Flexibility: Accept different inputs and return different results.

🚀 Example Purpose:
   - This simple program demonstrates creating and calling a method (`addNumbers`)
     that adds two integers and returns the result.
*/
