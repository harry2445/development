package com.example.ems.mapper;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.entity.Employee;

public class EmployeeMapper {

    //Map Employee entity to EmployeeDto
    public static EmployeeDto maptoEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
    }

    //Map EmployeeDto to Employee entity
    public static Employee maptoEmployee(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail());
    }
}
