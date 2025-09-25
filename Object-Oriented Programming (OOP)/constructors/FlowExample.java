public class FlowExample {

   
    // Instance block
    {
        System.out.println("Instance block executed. instanceVar = " + instanceVar);
        instanceVar = 40;
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method executed. staticVar = " + staticVar);
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method executed. instanceVar = " + instanceVar);
    }

    // Constructor
    public FlowExample() {
        System.out.println("Constructor executed. instanceVar = " + instanceVar);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Calling static method
        staticMethod();

        // Creating an instance of FlowExample
        FlowExample example = new FlowExample();

        // Calling instance method
        example.instanceMethod();

        System.out.println("Main method ended.");
    }
}
