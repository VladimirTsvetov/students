package dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDto {

    private Long id;

    private String firstname;

    private String lastname;

    private int mark;

}
