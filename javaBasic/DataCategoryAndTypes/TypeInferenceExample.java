import java.util.List;

public class TypeInferenceExample { // Renamed class to match the topic
    public static void main(String[] args) {
        // The compiler infers List<Integer> from the assigned value
        var numbers = List.of(1, 2, 3, 4, 5);

        // The compiler infers 'int' from the initial value 0
        var sumOfSquares = 0;

        // The compiler infers 'Integer' for each element in the list
        for (var num : numbers) {
            // Squaring the number and adding to the total sum
            sumOfSquares += num * num;
        }

        // Printing the result
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
