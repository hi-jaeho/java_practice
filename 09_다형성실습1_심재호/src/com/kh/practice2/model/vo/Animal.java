package com.kh.practice2.model.vo;

public abstract class Animal {
    private String name;
    private String kinds;
    
    protected Animal(){

    }

    protected Animal(String name, String kind){
        super();
        this.name = name;
        this.kinds = kind;
    }

    public String toString(){
        String str = "저의 이름은 %s 이고, 종류는 %s 입니다.".formatted(name, kinds);
        return str;
    }

    public abstract void speak();
    //일단 주석만 변경
}
