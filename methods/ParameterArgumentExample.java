public class ParameterArgumentExample {

    // Method with parameters 'name' and 'age'
    void printPersonInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ParameterArgumentExample obj = new ParameterArgumentExample();

        // Arguments are the actual values passed to the method
        // Here, "Alice" and 25 are arguments
        obj.printPersonInfo("Alice", 25);

        // Different arguments passed
        obj.printPersonInfo("Bob", 30);
    }
}
