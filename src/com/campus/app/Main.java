package com.campus.app;
import com.campus.model.*;
import com.campus.service.*;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // get student details from user input 
        System.out.println("Enter student details:");
        System.out.println("Student ID: ");
        int studentid = sc.nextInt();
        System.out.println("Student Name: ");
        String studname = sc.next();
        System.out.println("Student Age: ");
        int age = sc.nextInt();
        System.out.println("Student Department: ");
        String department = sc.next();
        System.out.println("Enter number of subjetcs:c ");
        int n=sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter mark for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }
        // Create a student object
        Student student1 = new Student(studentid, studname, age, department, marks);

        
        //display student details
        System.out.println("Student ID: " + student1.getstudentid());
        System.out.println("Student Name: " + student1.getStudentname());
        System.out.println("Student Age: " + student1.getage());
        System.out.println("Student Department: " + student1.getdepartment()); 
        // Create a studentservice object
        Studentservice service = new Studentservice();

        // Calculate total marks
        int totalMarks = service.calculatetotal(student1);
        System.out.println("Total Marks: " + totalMarks);

        // Calculate average marks
        double averageMarks = service.calculateaverage(student1);
        System.out.println("Average Marks: " + averageMarks);

        // Find maximum mark
        int maxMark = service.findmaximum(student1);
        System.out.println("Maximum Mark: " + maxMark);

        // Find minimum mark
        int minMark = service.findminimum(student1);
        System.out.println("Minimum Mark: " + minMark);

        // Determine grade based on marks
        String grade = service.grade(student1);
        System.out.println("Grade: " + grade);


    }

    
}