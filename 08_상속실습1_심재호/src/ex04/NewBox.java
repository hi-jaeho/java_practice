package ex04;

// 제네릭 - 외부에서 타입을 지정하는 방식
public class NewBox<T> {
    private T content; // type은 아직 안정해~ -> 생성할 때 내가 정할게

    public NewBox(T content){
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content = content;
    }
}
