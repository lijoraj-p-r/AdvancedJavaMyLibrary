/*

Declare a class Main.

Create a static method orderCoffee() inside the main class that prints: "Ordered a default coffee."

Create another static method orderCoffee(String type) that takes a String type parameter and prints: "Ordered a <type> coffee."

Create another static method orderCookie() with a return type of String and prints: "Ordered a default cookie."

Create another static method orderCookie(String type) that takes a String type parameter and returns: "Ordered a <type> cookie."

Create a main method that:

Calls orderCoffee().

Calls orderCoffee("Espresso").

Creates variables to store the return values from orderCookie() and prints them.
*/

// Task: Create a coffee shop simulation with methods for ordering coffee and cookies

public class FinalMethodExample {
    
    // Subtask 2: Static method with no parameters for coffee order
    public static void orderCoffee() {
        System.out.println("Ordered a default coffee.");
    }
    
    // Subtask 3: Static method with a parameter to specify the coffee type
    public static void orderCoffee(String type) {
        System.out.println("Ordered a " + type + " coffee.");
    }
    
    // Subtask 4: Static method with return type String for default cookie order
    public static String orderCookie() {
        return "Ordered a default cookie.";
    }
    
    // Subtask 5: Static method with a parameter to specify the cookie type and return type String
    public static String orderCookie(String type) {
        return "Ordered a " + type + " cookie.";
    }
    
    // Subtask 6: Main method to test all the methods
    public static void main(String[] args) {
        // Call orderCoffee() and orderCoffee("Espresso")
        orderCoffee();
        orderCoffee("Espresso");

        // Call orderCookie() and store the results
        String cookieOrder1 = orderCookie();
        System.out.println(cookieOrder1); // Output default cookie order
        
        String cookieOrder2 = orderCookie("Chocolate Chip");
        System.out.println(cookieOrder2); // Output specific cookie order
    }
}
