package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void updateEmployee(Employee employee);

    Employee getEmployee(int id);

    List<Employee> getAllEmployees();
}
