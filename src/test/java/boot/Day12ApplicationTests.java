package boot;

import boot.bean.Student;
import boot.mapper.StudentMapper;
import boot.service.inte.MyIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LiGuanda
 * @date 2023/1/26 下午 12:11:38
 * @description no description right now...
 * @filename Day12ApplicationTests.java
 */


@SpringBootTest
class Day12ApplicationTests {


    @Autowired
    private StudentMapper mapper;
    @Autowired
    private MyIService myIService;


    @Test
    void contextLoads() {

        System.out.println("---------------------------------------");
        /*Student tom = mapper.selectById(5);
        System.out.println(tom);*/
        /*int insert = mapper.insert(new Student(7, "鞠婧祎", "歌手", 100));
        System.out.println(insert);*/
        /*int update = mapper.updateById(new Student(7, "鞠婧祎", "歌手", 520));
        System.out.println(update);*/
        /*int delete = mapper.deleteById(7);
        System.out.println(delete);*/
        /*List<Student> students = mapper.selectBatchIds(Arrays.asList(1, 2, 3));
        students.forEach(System.out::println);*/
        /*Map<String, Object> map = new HashMap<>();
        map.put("name", "Jerry");
        List<Student> students = mapper.selectByMap(map);
        students.forEach(System.out::println);*/
        /*Map<Object, Object> map = mapper.selectMapById(5);
        for (Map.Entry<Object, Object> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "\t\t" + entry.getValue());

        }*/
        /*long count = myIService.count();
        System.out.println(count);*/
        /*boolean save = myIService.save(new Student(7, "鞠婧祎", "歌手", 100));
        System.out.println(save);*/
        /*boolean remove = myIService.removeById(7);
        System.out.println(remove);*/
        Student student = new Student();
        student.setName("IU");
        student.setOccupation("演员");
        student.setScore(99);
        boolean save = myIService.save(student);
        System.out.println(save);


    }


}
