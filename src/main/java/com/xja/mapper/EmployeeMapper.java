package com.xja.mapper;

import com.xja.entity.Employee;

/**
* @author O.Dentist
* @description 针对表【employee】的数据库操作Mapper
* @createDate 2023-03-07 17:25:51
* @Entity generator.domain.Employee
*/
public interface EmployeeMapper {
        public Employee findById(int epmloyeeId);
}




