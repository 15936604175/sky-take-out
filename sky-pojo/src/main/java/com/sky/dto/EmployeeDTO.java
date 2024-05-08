package com.sky.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    private Long id;
    @NotEmpty
    private String username;
    @NotEmpty
    private String name;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String sex;
    @NotEmpty
    private String idNumber;

}
