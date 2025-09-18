public class StaticAndInstanceMethodsDemo {

    static int staticVar = 5;

    static {
        staticVar = 10;
    }

    int instanceVar = 20;

    public static void staticMethod() {
        System.out.println("Static method executed. staticVar = " + staticVar);
    }

    public void instanceMethod() {
        System.out.println("Instance method executed. instanceVar = " + instanceVar);
    }

    public static void main(String[] args) {
        StaticAndInstanceMethodsDemo.staticMethod();

        StaticAndInstanceMethodsDemo obj = new StaticAndInstanceMethodsDemo();
        obj.instanceMethod();
    }
}
/* 
🧠 Execution Flow:

Static variable staticVar is declared and initialized to 5.

Static block overrides staticVar to 10. This runs once when the class is loaded.

The main method is executed:

Calls the static method: prints value of staticVar.

Creates an object (obj), which initializes instanceVar to 20.

Calls the instance method: prints value of instanceVar.
*/
