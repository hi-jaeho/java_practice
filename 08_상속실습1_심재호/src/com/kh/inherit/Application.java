package com.kh.inherit;

import java.util.Scanner;
import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for(Student s:students){
            System.out.println(s.information());
        }

        Employee[] employees = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int keepGoing = 0;
        
        while (true) {
            if (keepGoing == 0){
                System.out.print("이름: ");
                String name = sc.next();
                System.out.print("나이: ");
                int age = sc.nextInt();
                System.out.print("신장: ");
                double height = sc.nextDouble();
                System.out.print("체중: ");
                double weight = sc.nextDouble();
                System.out.print("급여: ");
                int salary = sc.nextInt();
                System.out.print("부서: ");
                String dept = sc.next();
    
                employees[index++] = new Employee(name, age, height, weight, salary, dept);
                keepGoing = 1;
            }

            if (keepGoing == 1){
                System.out.println("계속하시려면 Y(y)를, 중단하시려면 N(n)을 입력해주세요.");
                String choice = sc.next();
                if(choice.charAt(0) == 'y' || choice.charAt(0) == 'Y'){
                    System.out.println("Y(y)를 입력하셨습니다. 입력을 계속합니다.");
                    keepGoing = 0;
                    continue;
                }
                else if(choice.charAt(0) == 'n' || choice.charAt(0) == 'N'){
                    System.out.println("N(n)을 입력하셨습니다. 입력을 중단합니다.");
                    break;
                }
                else{
                    System.out.println("잘못된 입력입니다. 계속하시려면 Y(y)를, 중단하시려면 N(n)을 입력해주세요.");
                }
            }

        }

        for(Employee e:employees){
            System.out.println(e.information());
        }
    }
}
