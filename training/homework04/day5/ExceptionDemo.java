package com.trimindtech.training.homework04.day5;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("enter the name");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("enter the age");
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println("please enter the numeric type");
        }
    }
}
