package com.trimindtech.training.homework04.day5;

import java.util.Scanner;

public class Student {
    public String studentName;
    public int studentId;

    public Student(String name,int id){

         studentName=name;
         studentId=id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        Student s=(Student)obj;
        boolean studentNameMatched=this.getStudentName().equals(s.getStudentName());
        boolean studentIdMatched=this.getStudentId() == s.getStudentId() ;



        return studentNameMatched &&studentIdMatched;
    }

    /*public static void studentDetails(Student[] d, Student r) {
     for () {
         if () {
             System.out.println("the student details already exist");
         }*/




}
