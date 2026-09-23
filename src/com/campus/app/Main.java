package com.campus.app;
import com.campus.model.student;
import com.campus.service.studentservice;

public class Main {
    
    public static void main(String[] args) {
        // Create a student object
        int[] marks = {85, 90, 78, 92, 88};
        student student1 = new student(1, "John Doe", 20, "Computer Science", marks);
        //display student details
        System.out.println("Student ID: " + student1.getstudentid());
        System.out.println("Student Name: " + student1.getStudentname());
        System.out.println("Student Age: " + student1.getage());
        System.out.println("Student Department: " + student1.getdepartment()); 
        // Create a studentservice object
        studentservice service = new studentservice();

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