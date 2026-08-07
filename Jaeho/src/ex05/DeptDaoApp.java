package ex05;

import java.util.List;

import ex05.dao.DeptDAO;
import ex05.dto.DeptDTO;

public class DeptDaoApp {
    public static void main(String[] args) {
        DeptDTO deptDTO = new DeptDTO("D1", "총무부", "1층");
        DeptDAO dao = new DeptDAO();
        List<DeptDTO> list = dao.findAll();
        // toString 메서드 재정의 -> lombok이 알아서 해줌 ㄹㅇ ㅋㅋ;
        System.out.println(list);
    }
}
