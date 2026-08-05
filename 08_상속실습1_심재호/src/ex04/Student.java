package ex04;

public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    @Override
    public boolean equals(Object obj){
        // 참조되고 있는 주소가 같은지 확인  
        if(this == obj) return true;
        
        // name + "/" + studentId
        // 강제 형변환(명시적 형변환): 타입 확인하지 않으면 예외가 발생
        // 형변환 하기 전에 변환이 가능한지 확인 -> instanceof
        if(obj instanceof Student){ // obj가 Student로 형변환 ㄱㄴ?
            Student s = (Student)obj; // ㄱㄴ하면 형변환 ㄱㄱ
            System.out.println("this.학번: " + this.studentId);
            System.out.println("obj.학번: " + s.studentId);
            //같은지 확인
            if(studentId.equals(s.studentId)){
                return true;
            }
        }
        return false;
        // 학번과 이름이 같으면 같은 객체라고 판단
    }

    @Override
    public int hashCode(){
        return studentId.hashCode();
    }
    // 학번과 이름이 같으면 같은 학생이라고판단할 수 있도록 메서드 재정의
}
