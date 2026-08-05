package ex04;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("짱구", "1111");
        Student s3 = new Student("짱구", "1111");
        Student s2 = new Student("철수", "2222");

        System.out.println("==========");
        if(s1.equals(s3)){
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
        System.out.println("==========");
        if(s1.equals(s2)){
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
        System.out.println("==========");
        // String 객체의 equals 메서드도 재정의 되어 있음
        // 같은 문자열이면 같다고 판단
        // "".equals(s2);


    }
}
