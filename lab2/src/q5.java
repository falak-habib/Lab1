/*
5. Aim of the program : Write a program in java to input
 and display the details of n number of students having roll,
 name and cgpa as data members. Also display the name of the student having lowest cgpa.
Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students.
 Also display the name of student with lowest cgpa
 */


import java.util.*;

class Student {
    int roll;
    String name;
    double cgpa;

    // Constructor
    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        // Display all student details
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }

        // Find student with lowest CGPA
        Student lowest = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowest.cgpa) {
                lowest = students[i];
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + lowest.name);
        sc.close();
    }
}
