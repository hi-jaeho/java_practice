package ex04;

public class NewArrayBoxApp {
    public static void main(String[] args) {
        NewArrayBox<String> box = new NewArrayBox<>(); // 문자열을 담을 수 있는 box를 만든거
        NewArrayBox<Student> stuBox = new NewArrayBox<>();
        // NewArrayBox<Int> intBox = new NewArrayBox<>(); // int 타입은 안됨
        // 기본타입은 Object로 형변환이 불가능함. int 대신 integer!
        NewArrayBox<Integer> intBox = new NewArrayBox<>();
    }
}
