package ex05.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import ex05.dto.DeptDTO;
import ex05.util.DBUtil;

// 자바 APP에서 DB에 접근해 CRUD
public class DeptDAO {
    // 접근제한자 반환타입 메서드명 (매개변수 타입 매개변수명) {}
    /**
     * DB로 부터 부서정보를 조회 후 리스트 반환
     * @return List<DeptDTO>
     */

    public List<DeptDTO> findAll(){
        List<DeptDTO> list = new ArrayList<>();
        
        // DB Connection
        try (
            // try() 이렇게 해야 자원을 아낄 수 있음
            // Query
            Connection con =  DBUtil.getConnection();
            // Object <- Query Result
            Statement stmt = con.createStatement();
    
            // 결과집합 반환
            // select -> 결과집합
            // insert, update, delete -> 숫자반환(몇 건이 처리 되었는지)
            ResultSet rs = stmt.executeQuery("select * from DEPT");
        ){
            // => 계층간 데이터 이동
            // controller <-> service <-> dao(mapper) 3개의 계층
            while (rs.next()) {
                // 데이터를 꺼내서 변수에 저장하고 객체를 만들어줌
                String deptId = rs.getString(1);
                String deptTitle = rs.getString(2);
                String locationId = rs.getString(3);

                list.add(new DeptDTO(deptId, deptTitle, locationId));
            }
        }   catch   (SQLException e){
            e.printStackTrace();
        }

        return list;
    }
}
