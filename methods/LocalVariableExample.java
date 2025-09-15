public class LocalVariableExample {
    public static void main(String[] args) {
        int totalMarks = 0;  // Local variable declared inside the main method
        totalMarks = 90 + 85 + 78;
        System.out.println("The total marks are: " + totalMarks);  // Output: The total marks are: 253
    }
}

/*
Explanation:

- In this code, totalMarks is a local variable. It only exists inside the main method, 
  and once the method finishes, it's gone—just like a single-use ingredient!

Why Do We Use Local Variables?

- Temporary Storage: Local variables are perfect for storing data that you need temporarily, 
  like counters or results of calculations.

- Encapsulation: They help keep data hidden within a method, preventing other parts of the program 
  from accidentally changing their values. Imagine having a secret ingredient that makes your dish perfect—no one else can mess it up if they don't have access!

- Memory Management: Once the method is done executing, the local variables are cleared from memory, 
  keeping things efficient. Think of them like disposable plates at a party—you use them, then toss them, making cleanup easier.

Scope of Local Variables:

- The scope of a local variable is limited to the method or block of code where it's declared. 
  You can think of scope as the area where a variable is "alive" and can be used.

- If a local variable is declared inside a method, it can only be used within that method.

- If it's declared inside a smaller block within the method, it only exists within that block.

*/
