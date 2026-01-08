/*
Aim of the program : Write a program to overload
subtract method with various parameters in a class in Java.
Write the driver class to use the different subtract methods using object.
Input: Mention various subtract method having different parameters.
Output: Subtract method will display the result accordingly
 */
// Class with overloaded subtract methods
class Calculator {

    // Subtract two integers
    int subtract(int a, int b) {
        return a - b;
    }

    // Subtract three integers
    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Subtract two doubles
    double subtract(double a, double b) {
        return a - b;
    }

    // Subtract an integer from a double
    double subtract(double a, int b) {
        return a - b;
    }

    // Subtract an array of integers
    int subtract(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result -= arr[i];
        }
        return result;
    }
}

// Driver class
public class q6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using different subtract methods
        System.out.println("Subtract two integers: " + calc.subtract(10, 5));
        System.out.println("Subtract three integers: " + calc.subtract(20, 5, 3));
        System.out.println("Subtract two doubles: " + calc.subtract(15.5, 4.2));
        System.out.println("Subtract double and int: " + calc.subtract(12.7, 2));

        int[] numbers = {50, 10, 5, 2};
        System.out.println("Subtract array elements: " + calc.subtract(numbers));
    }
}
