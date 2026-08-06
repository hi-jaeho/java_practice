public class Professor {
    String name;
    String professorId;

    public Professor(){

    }

    public Professor(String name, String professorId){
        this.name = name;
        this.professorId = professorId;
    }

    @Override
    public String toString(){
        return "교수[이름=" + name + ", 교수번호=" + professorId + "]";
    }


}
