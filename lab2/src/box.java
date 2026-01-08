/*
Aim of the program :Write a class file – box with three data members(length, width,
height) and a method volume() . Also implement the application class Demo
where an object of the box class is created with user entered dimensions and
volume is printed.
Input: length,width and height.
Output: Volume
 */

import java.util.*;
public class box {
    double length;
    double width;
    double height;

    box(double l,double w,double h)
    {
        length = l;
        width = w;
        height = h;
    }

    double volume()
    {
        return length*width*height;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length ");
        double l = sc.nextDouble();

        System.out.println("enter width ");
        double w = sc.nextDouble();

        System.out.println("enter height ");
        double h = sc.nextDouble();

        box a = new box(l,w,h);

        System.out.println("volume is: "+ a.volume());
    }
}
