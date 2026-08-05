package com.kh.inherit.practice;

public class Student extends Person{
    private int grade;
    private String major;

    public Student(){

    }

    public Student(String name, int age, double height, double weight, int grade, String major){
        super(age, height, weight);
        super.setName(name);
        this.grade = grade;
        this.major = major;
    }

    public int getGrade(){
        return grade;
    }

    public String getMajor(){
        return major;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void setMajor(String major){
        this.major = major;
    }
    
    @Override
    public String information(){
        String parent = super.information();
        String str = parent + " , 학년: %d, 전공: %s".formatted(grade, major);
        return str;
    }
}
