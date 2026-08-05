package com.kh.inherit.practice;

public class Employee extends Person{
    private int salary;
    private String dept;

    public Employee(){

    }

    public Employee(String name, int age, double height, double weight, int salary, String dept){
        super(age, height, weight);
        super.setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary(){
        return salary;
    }

    public String getDept(){
        return dept;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    @Override
    public String information(){
        String parent = super.information();
        String str = parent + " , 급여: %d, 부서: %s".formatted(salary, dept);
        return str;
    }
}
