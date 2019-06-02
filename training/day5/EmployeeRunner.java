package com.trimindtech.training.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee e1=new Employee("raghu",1001,10000);
        Employee e2=new Employee("ram",1002,10000);
        Employee e3=new Employee("raghu",1003,10000);

        ArrayList<Employee>emp=new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        Employee e4=new Employee("raghu",1001,10000);
        Employee e5=new Employee("raghu1",1001,10000);

        System.out.println(emp.contains(e4));

        Set<Employee>empSet=new HashSet<>();
        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e4);
        empSet.add(e5);
        for(Employee e:empSet){
            System.out.println(e.toString());
        }

    }
}
