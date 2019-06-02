package com.trimindtech.training.day5;

public class Employee {

    private String name;
    private int id;
    private  double salary;


    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   @Override
    public boolean equals(Object obj) {
        Employee e=(Employee)obj;
        return this.getName().equals(e.getName())&&
                this.getId()==e.getId()&&
                this.getSalary()==e.getSalary();

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return id;
    }
}
