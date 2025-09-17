// 🧠 Example: Defining a class and creating an object in Java

// This is the class definition.
// A class is a blueprint for creating objects.
class Car {
    
    // Field (property) of the class
    String color;

    // Method (behavior) of the class
    void drive() {
        System.out.println("The car is driving.");
    }
}

// This is the main class where the program starts
public class CarExampleOop {
    
    // Main method: the entry point of any Java program
    public static void main(String[] args) {
        
        // Object creation: 'myCar' is an object of the 'Car' class
        Car myCar = new Car();  // 👈 Creates a new Car object in memory

        // Assign a value to the object's field
        myCar.color = "Red";    // 👈 Setting the color of myCar

        // Print the color of the car
        System.out.println("Car color: " + myCar.color);  // Output: Car color: Red

        // Call the drive() method of the Car object
        myCar.drive();  // 👈 Outputs: The car is driving.
    }
}
