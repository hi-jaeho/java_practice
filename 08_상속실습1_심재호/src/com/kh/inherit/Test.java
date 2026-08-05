package com.kh.inherit;

import com.kh.inherit.practice.Student;

public class Test {
    public static void main(String[] args) {
        // 모든 클래스는 Object를 상속 받고 있으므로 Object 형변환 가능
        // 자동형 변환
        // Object타입을 이용하면 어떤 타입이든 저장 가능
        Object[] objs = new Object[10];
        objs[0] = 1;
        objs[1] = "";
        objs[2] = new Student();

        // 꺼내서 쓸 때 문제발생...
    }
}
