package com.campus.model;

public class Student {
    //encapsulation. data hiding.instance variable
    private int studentid;
    private String studname;
    private int age;
    private String department;
    private int[] marks;


    //static variable

    static int studentcount=0;

    //deefault constructor 

    public Student(){
        studentcount++;

    }

    //parameterized constructor

    public Student(int studentid,String studname,int age,String department,int[] marks){
        this.studentid=studentid;
        this.studname=studname;
        this.age=age;
        this.department=department;
        this.marks=marks;
        studentcount++;
    }

    public int getstudentid(){
        return studentid;
    }

    public String getStudentname(){
        return studname;
    }
    public int getage(){
        return age;
    }
    public String getdepartment(){
        return department;

    }
    public int[] getmarks(){
        return marks;

    }

    //setters
    public void setstudentid(int studentid){
        this.studentid=studentid;

    }public void setstudentname(String studname){
        this.studname=studname;

    }public void setage(int age){
        this.age =age;

    }public void setdepartment(String department){
        this.department=department;

    }public void setmarks(int[] marks){
        this.marks=marks;

    }
    //instance method-belong t object\
    public void displaystudentinfo(){
        System.out.println("Student ID: "+studentid);
        System.out.println("Student Name: "+studname);
        System.out.println("Age: "+age);
        System.out.println("Department: "+department);
    }
public void displaystudentinfo(boolean showmarks){
    displaystudentinfo();
    if(showmarks){
        System.out.println("Marks: " + java.util.Arrays.toString(marks));    
    }
}

//static method-belong to class not to object
public static void displaystudentcount(){
    System.out.println("Total number of students: "+studentcount);
}  
}