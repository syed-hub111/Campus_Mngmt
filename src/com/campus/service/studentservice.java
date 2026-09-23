package com.campus.service;

import com.campus.model.student;

public class studentservice {
public int calculatetotal(student student){
    if (student.getmarks()==null){
        return 0;
    }
    int total = 0;
    for (int mark : student.getmarks()) {
        total += mark;
    }
    return total;
}
public double calculateaverage(student student){
    if (student.getmarks()==null || student.getmarks().length==0){
        return 0.0;
    }
    int total = calculatetotal(student);
    return (double) total / student.getmarks().length;
}

//find maximum mark
public int findmaximum(student student){
    if (student.getmarks()==null || student.getmarks().length==0){
        return 0;
    }
    int max = student.getmarks()[0];
    for (int mark : student.getmarks()) {
        if (mark > max) {
            max = mark; 
        }
    }
        return max;
    
    }

    //minimum mark
    public int findminimum(student student){
        if (student.getmarks()==null || student.getmarks().length==0){
            return 0;
        }
        int min = student.getmarks()[0];
        for (int mark : student.getmarks()) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    //grade based on marks

    public String grade(student student){

        int[] marks= student.getmarks();
        if(marks == null || marks.length==0){
            return "Fail";
        }
        int total=calculatetotal(student);
        int average= (int) calculateaverage(student);

        if(average>=90){
            return "A";

        }else if(average<=89 && average >= 70){
            return "B";
        }else if(average<=69 && average>=55)
        {
            return "c";
        }else if(average<=54 && average >=45){
            return "d";
        }else if(average<45){
            return"backbencher";
        }
        return total>=90?"A":total>=70?"B":total>=55?"C":total>=45?"D":"Backbencher";
    }

    
}