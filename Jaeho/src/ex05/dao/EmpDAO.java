package ex05.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;
import java.sql.SQLException;
import java.sql.Statement;

import ex05.dto.EmpDTO;
import ex05.util.DBUtil;

// 데이터베이스에 접근해서 쿼리 질의결과를 반환
// XXXDAO
// Data Access Object의 약자
// 자바 애플리케이션에서 DB에 접근하여 데이터의 CRUD 작업을 전담하는 객체(클래스)
public class EmpDAO {
    // 사원의 정보를 조회하고 리스트를 반환
    public List<EmpDTO> findAll(){
        List<EmpDTO> empList = new ArrayList<>();
        
        // Query for getting EMP Infomation
        String sql = "Select * From EMP";
        
        try (
            // 1. connection 
            Connection con = DBUtil.getConnection();
            // 2. Query Object
            Statement st = con.createStatement();
            // 3. Return ResultSet -> Make Object -> List
            ResultSet rs = st.executeQuery(sql);

        ) {
            while (rs.next()) {
                String empId = rs.getString(1);
                String empName = rs.getString(2);
                int salary = rs.getInt(8);

                // dto 생성 및 리스트에 담기
                empList.add(new EmpDTO(empId, empName, salary));
            }
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return empList;
    }

    public EmpDTO find(String name) {
        EmpDTO emp = null;
        String sql = "SELECT * FROM EMP WHERE EMP_NAME = '%s'".formatted(name);
        try (
            // 1. connection 
            Connection con = DBUtil.getConnection();
            // 2. Query Object
            Statement st = con.createStatement();
            // 3. Return ResultSet -> Make Object -> List
            ResultSet rs = st.executeQuery(sql);
        ) {
            if(rs.next()){
                String empId = rs.getString(1);
                String empName = rs.getString(2);
                int salary = rs.getInt(8);
                
                return new EmpDTO(empId, empName, salary);
            }
        } catch (Exception e) {
            
        }
        return emp;
    }
}
