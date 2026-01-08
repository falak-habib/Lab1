/*
1. Aim of the program : Accept 10 numbers from command line and check
 how many of them are
even and how many are odd.
Input: Enter 10 number from keyboard
Output: Display number of even and odd number
 */

import java.util.*;
public class q1 {
    public static void main(String[] args)
    {
        int evenCount =0;
        int oddCount =0;

        for(int i =0; i<10;i++)
        {
            Scanner n =new Scanner(System.in);
            System.out.println("enter number ");

            int rn = n.nextInt();

            if(rn%2==0) evenCount++;
            else oddCount++;

        }

        System.out.println("count of even numbers= "+ evenCount);
        System.out.println("count of odd numbers= "+ oddCount);

    }
}
