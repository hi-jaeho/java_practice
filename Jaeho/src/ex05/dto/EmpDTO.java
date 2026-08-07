package ex05.dto;
// XXXDTO
// Data Transfer Object
// 데이터를 계층 간에 전달하기 위해 순수하게 데이터를 담아두는 객체
public class EmpDTO {
    String empId;
    String empName;
    int salary;

    public EmpDTO(String empId, String empName, int salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "%s %s %d".formatted(empId, empName, salary);
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    



}
