/*
2. Aim of the program: Program to find no. of objects created
out of a class using ‘static’
modifier.
Input: No of objects created
Output: Display the number of objects created (e.g. no of objects=3)
 */

import java.util.*;

public class q2 {
    static int count=0;

    q2()
    {
        count++;
    }

    static void displayCount()
    {
        System.out.println("number of objects = "+ count);
    }

    public static void main(String[] args)
    {
        q2 obj1 = new q2();
        q2 obj2 = new q2();
        q2 obj3 = new q2();

        q2.displayCount();
    }
}
