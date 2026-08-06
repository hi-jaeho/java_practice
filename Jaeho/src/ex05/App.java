package ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ex05.dto.EmpDTO;
import ex05.util.DBUtil;

public class App {
    // 접속정보 필드로 정의 -> git에 노출될 위험이 있음 -> 프로퍼티 파일로 옮겨서 관리
    private static final String URL ="jdbc:mysql://43.201.71.210:3306/HR?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    

    // throws: 예외를 호출한 곳으로 위임
    // 메서드를 호출한 곳에서 처리해야함
    public static void main(String[] args) throws ClassNotFoundException{
        List<EmpDTO> empList = new ArrayList<>();
        int index = 1;
        // 예외를 발생시킬 소지가 있는 메서드인 경우(method 뒤에 throw가 붙어 있는 경우) -> 오류를 어떻게 처리해야 할지 직접 정해줘야함
        // 방법 1.프로그램의 비정상적인 종료 -> 메서스 라인에 throws 씀
        // 방법 2.try-catch
        try {
            Class.forName("ex05.util.DBUtil"); // 이런 클라스가 존재하는지 확인
            System.out.println("=== ex05.util.DBUtil confirmed ===");

            // 1. DB Connection 얻어오기 - 네트워크 통신 및 인증
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            // 2. Query
            Statement st = conn.createStatement();
            
            // rs = 쿼리 실행한 결과
            ResultSet rs = st.executeQuery("select * from EMP"); // Exectue Query
            
            // rs의 커서는 맨 윗줄을 가르킴 -> 1번째 요소보다 더 앞
            // 그래서 next()를 써서 1번째 요소를 가르키도록 함
            // rs.next();

            while (rs.next()) {
                // getString으로 요소값 꺼내오기
                String empId = rs.getString("EMP_ID");
                String empName = rs.getString("EMP_NAME");
                int salary = rs.getInt("SALARY");

                EmpDTO emp = new EmpDTO(empId, empName, salary);
                empList.add(emp);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Plz check Mysql JDBC Lib");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Plz check SQL");
            e.printStackTrace();;
        }

        System.out.println("=== Exit Program! ===");
        System.out.println("=== size : " + empList.size() + " ===");
        for(EmpDTO e: empList){
            if (e != null){
                System.out.println("%d : ".formatted(index++) + e);
            } else { break; }
        }
    }
}
