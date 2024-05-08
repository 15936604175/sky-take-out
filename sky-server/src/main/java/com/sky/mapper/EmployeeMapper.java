package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     *
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    @Insert("insert into employee(name,username,password,phone,sex,id_number,status,create_time,update_time,create_user,update_user) " +
            "values (#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser})")
    @AutoFill(value = OperationType.INSERT)
    void add(Employee employee);


    Page<Employee> pageSelect(EmployeePageQueryDTO employeePageQueryDTO);

    //根据id单独修改status属性
    @Update("update employee set status=#{status} where id=#{id}")
    void startOrStop(Integer status, Long id);

    //可以根据id修改所有属性
    @AutoFill(value = OperationType.UPDATE)
    void update(Employee employee);

    //根据id获取员工信息
    @Select("select * from employee where id=#{id}")
    Employee getEmployeeById(Long id);
}
