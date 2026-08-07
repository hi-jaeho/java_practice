package ex05;

import java.util.List;
import ex05.dao.EmpDAO;
import ex05.dto.EmpDTO;

public class DaoApp {
        public static void main(String[] args) {
                EmpDAO empDao = new EmpDAO();
                List<EmpDTO> list = empDao.findAll();
                // System.out.println(list);

                for(EmpDTO emp: list){
                    System.out.println(emp);
                }
        }
}
