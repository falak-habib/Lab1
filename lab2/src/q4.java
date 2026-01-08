/*
Aim of the program : Write a program in Java to create a class Rectangle having data
members length and breadth and three methods called read, calculate and display to
 read the
values of length and breadth, calculate the area and perimeter of the rectangle
and display the
result respectively.
 */

import java.util.*;
public class q4 {

    double length;
    double breadth;
    double area;
    double perimeter;

    void read(double l,double b)
    {
        length = l;
        breadth = b;
    }

    void calculate()
    {
        area = length*breadth;
        perimeter = 2*(length+breadth);
    }

    void display()
    {
        System.out.println("Area is: "+ area+ " " + "Perimeter is: " + perimeter);
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        double l = sc.nextDouble();

        System.out.println("enter breadth");
        double b = sc.nextDouble();

        // Create object of class q4
        q4 rect = new q4();

        // Call methods in sequence
        rect.read(l, b);
        rect.calculate();
        rect.display();




    }
}
