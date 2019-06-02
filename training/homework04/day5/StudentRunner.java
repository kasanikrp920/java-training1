package com.trimindtech.training.homework04.day5;

import java.util.ArrayList;

public class StudentRunner {
    public static void main(String[] args) {
        // Student[]s=new Student[7];
        Student s1 = new Student("raghu", 1);
        Student s2 = new Student("raghu", 1);
        Student s3 = new Student("raghu", 1);
        Student s4 = new Student("raghu", 1);
        Student[] students = {s1, s2, s3};
       /* ArrayList<Student> st = new ArrayList<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);*/

      Student r=new Student("raghu",1);
        System.out.println( studentExist(students ,  r));

    }
        public static boolean studentExist(Student[] students, Student r) {
            for(Student student:students){
                if(student.equals(r)){
                    return true;
                }
            }
            return false;
        }


}




