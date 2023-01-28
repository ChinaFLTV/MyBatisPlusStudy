package boot.mapper;

import boot.bean.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @author LiGuanda
 * @date 2023/1/26 上午 10:18:10
 * @description no description right now...
 * @filename StudentMapper.java
 */

@Mapper
public interface StudentMapper extends BaseMapper<Student> {


    @SuppressWarnings("MybatisXMapperMethodInspection")
    Map<Object, Object> selectMapById(int id);


}
