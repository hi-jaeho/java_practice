package com.kh.practice2.model.vo;

public class Dog extends Animal {
    public static final String PLACE = "애견카페";
    private int weight;

    public Dog(){

    }

    public Dog(String name, String kinds, int weight){
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public void speak(){
        String parent = super.toString();
        String str = "몸무게는 %s kg입니다.".formatted(weight);
        System.out.println(parent + str);
    }
}
