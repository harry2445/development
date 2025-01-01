package com.example.ems.service;

import com.example.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
   EmployeeDto createEmployee(EmployeeDto employeeDto);

   EmployeeDto getEmployeeById(Long employeeId);

   EmployeeDto deleteEmployee(Long employeeId);

   List<EmployeeDto> getAllEmployees();
}