package boot.service.impl;

import boot.bean.Student;
import boot.mapper.StudentMapper;
import boot.service.inte.MyIService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author LiGuanda
 * @date 2023/1/26 下午 1:12:25
 * @description no description right now...
 * @filename MyIServiceImpl.java
 */


@Service
public class MyIServiceImpl extends ServiceImpl<StudentMapper, Student> implements MyIService {



}
