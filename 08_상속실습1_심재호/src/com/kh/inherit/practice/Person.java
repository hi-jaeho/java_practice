package com.kh.inherit.practice;

public class Person {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public Person() {
        
    }
    
    public Person(int age, double height, double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public String information(){
        String str = "이름: %s, 나이: %d, 신장: %.1f, 체중: %.1f".formatted(name, age, height, weight);
        return str;
    }
}
