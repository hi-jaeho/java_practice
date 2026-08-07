package ex05.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 테이블에서 조회된 값을 값을 담기 위해 필드를 선언한다
// lombok 라이브러리를 사용하면 어노테이션(@)을 사용해서
// set, get, 생성자를 자동으로 생성할 수 있다!!!

// setter, getter, toString
@Data

// parameter 생성자
@AllArgsConstructor

// 기본생성자
@NoArgsConstructor

public class DeptDTO {
    // Define Field
    private String deptId;
    private String deptCode;
    private String locationId;
}
