package ex04;

public class NewArrayBox<T> {
    // 배열은 타입을 지정
    private T[] arr;
    private int index; // 초기화 안해도 0이 됨
    
    public NewArrayBox() {
        arr = (T[10])new Object[10];
    }

    public void add(T obj){
        arr[index++] = obj;
    }
}
