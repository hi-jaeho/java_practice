package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {
    public static void main(String[] args) {
        // 1.Animal 타입의 객체배열 크기 5로 생성
        Animal[] animals = new Animal[5];

        // 2.각 인덱스에 무작위로 dog, cat 생성해서 넣기
        // 객체 생성
        Dog dog1 = new Dog("멍멍이", "dog", 15);
        // 부모 타입으로 자동 형 변환
        animals[0] = dog1;
        animals[1] = new Cat("냐옹일", "cat", "서울", "노랑");
        animals[2] = new Cat("냐옹이", "cat", "부산", "파랑");
        animals[3] = new Cat("냐옹삼", "cat", "대전", "빨랑");
        animals[4] = new Dog("냥멍이","dog", 35);
        
        // 3. 배열의 요소를 순회하며 toString을 출력
        // 타입 변수명: 배열/리스트
        for(Animal a: animals){
            // System.out.println(a.toString());
            // 객체를 출력하면 객체의 toString메서드가 호출됨
            System.out.println(a);
            System.out.println("=============================");
            a.speak();
        }
    }
}
