package boot.bean;

import lombok.*;
import org.springframework.stereotype.Component;

/**
*
* @author LiGuanda
* @date 2023/1/26 上午 10:14:04
* @description no description right now...
* @filename Student.java
*
*/

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student_1 {


    private int id;
    private String name;
    private String occupation;
    private int score;




}
