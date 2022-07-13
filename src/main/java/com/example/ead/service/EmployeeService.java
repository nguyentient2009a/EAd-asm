package com.example.ead.service;

import com.example.ead.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List< EmployeeEntity > getAllEmployees();
    void saveEmployee(EmployeeEntity employeeEntity);

    List<EmployeeEntity> getALlEmployees();

    void saveEmployeeById(EmployeeEntity employeeEntity);


}
