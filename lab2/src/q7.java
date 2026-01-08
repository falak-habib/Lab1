/*
Aim of the program : Write a program in java using
constructor overloading concept to calculate the area
of a rectangle having data member as length and breadth.
Use default constructor to initialize the value of the data
member to zero and parameterized constructor to initialize the
value of data member according to the user input.
Input: Mention the value of length and breadth
Output: Display the area of rectangle accordingly.
 */

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    // Default constructor → initializes to zero
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor → initializes with user input
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Area using default constructor: " + r1.area());

        // Using parameterized constructor
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();

        Rectangle r2 = new Rectangle(l, b);
        System.out.println("Area using parameterized constructor: " + r2.area());

        sc.close();
    }
}
