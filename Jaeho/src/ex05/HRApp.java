package ex05;

import java.util.*;

import ex05.dao.DeptDAO;
import ex05.dao.EmpDAO;
import ex05.dto.DeptDTO;
import ex05.dto.EmpDTO;

public class HRApp {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
            
            EmpDAO empDao = new EmpDAO();
            DeptDAO deptDao = new DeptDAO();

            if (select == 1){
                //　 사원 목록 - empDAO
                List<EmpDTO> list = empDao.findAll();
        
                System.out.println(list);
            } else if (select == 2){
                //　 부서 목록 - deptDAO
                List<DeptDTO> list = deptDao.findAll();
        
                System.out.println(list);
            } else if (select == 3){
                System.out.print("이름을 입력해주세요 : ");
                String name = sc.next();
                System.out.println(name);
                EmpDTO empDto = empDao.find(name);
                if(empDto != null){
                    System.out.println(empDto);
                    System.out.println("퇴사 처리 할래?(Y/N");
                    String choice = sc.next();
                    if (choice.equals("Y")){
                        sql = "UPDATE EMP SET ENT_YN='Y' WHERE EMP_NAME='%s'".formatted(name);
                        
                    }
                }
            } else if (select == 4){
            } else if (select == 0){
                System.exit(select);
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }

        }
            
    }

    static void printMenu(){
        System.out.println("""
                =====================
                Menu
                1. Emp List
                2. Dept List
                3. Find Emp(by Name)
                4. Find Emp(by ID)
                0. Exit
                Select the Menu Please
                =====================
                """);
    }
}
