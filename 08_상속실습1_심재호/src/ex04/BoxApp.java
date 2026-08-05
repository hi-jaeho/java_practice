package ex04;

import java.util.*;

public class BoxApp {
    public static void main(String[] args) {
        Box box1 = new Box(1);
        Box box2 = new Box("abcdefuck");
        Box box3 = new Box(new Student("jaeho", "1234"));

        // 이렇게 하면 형변환 시 오류의 위험성이 있고, 값을 꺼낼 때마다 확인해줘야 함
        // String str = (String)box1.getContent();
        // System.out.println(str);
        System.out.println("===============================");
        NewBox<String> stringBox = new NewBox<String>("제네릭으로 타입 지정했음 ㅅㅅ!");
        System.out.println(stringBox.getContent());

        List<String> list = new ArrayList<>();
        list.add("t1");
        list.add("t2");
        list.add("t3");
        System.out.println(list);
        
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("재호", "0000"));
        stuList.add(new Student("상혁", "1111"));
        stuList.add(new Student("금빈", "2222"));
        
        for(Student s: stuList){
            System.out.println(s.getName());
            System.out.println(s.getStudentId());
        }

        System.out.println("===============================");
    }
}
// 