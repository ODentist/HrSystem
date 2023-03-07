package com.xja.test.employeemapper;


import com.xja.entity.Employee;
import com.xja.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-root.xml"})
public class TestEmployeeMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    // 测试方法
    @Test
    public void findEmployeeById(){
        // 调用数据访问层
        Employee employee = employeeMapper.findById(5);
        // 将查询的结果进行显示
        System.out.println(employee);

    }

}


