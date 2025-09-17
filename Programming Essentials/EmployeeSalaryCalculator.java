// EmployeeSalaryCalculator.java
// This program calculates the total salary paid to employees using a for loop

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        // Array holding salaries of employees in dollars
        double[] salaries = {45000.50, 52000.75, 60000, 48000.25, 75000.10};

        double totalSalary = 0; // Variable to store sum of salaries

        // For loop to iterate through each salary and add it to totalSalary
        for (int i = 0; i < salaries.length; i++) {
            totalSalary += salaries[i]; // Add current salary to total
            System.out.println("Adding salary of employee " + (i + 1) + ": $" + salaries[i]);
        }

        // After the loop, print the total salary amount
        System.out.printf("Total salary to be paid: $%.2f%n", totalSalary);
    }
}
