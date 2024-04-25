package com.sky.service;

import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;
import io.swagger.models.auth.In;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void add(Employee employee);

    //员工分页查询
    PageResult pageSelect(EmployeePageQueryDTO employeePageQueryDTO);

    void startOrStop(Integer status, Long id);
}
