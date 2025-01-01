package com.example.ems.controller;

import com.example.ems.dto.EmployeeDto;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.apache.catalina.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Validated
public interface EmployeeInterface {
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),

            @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/user/createWithList",
            produces = { "application/json", "application/xml" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public EmployeeDto createEmployee(EmployeeDto employeeDto);
    public EmployeeDto getEmployeeById(Long employeeId);
    public EmployeeDto deleteEmployee(Long employeeId);
    public List<EmployeeDto> getAllEmployees();
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);
}
