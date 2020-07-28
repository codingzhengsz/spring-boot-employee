package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        for (Employee e : employees) {
            if (e.getId() == employee.getId()) {
                e.setAge(employee.getAge());
                e.setGender(employee.getGender());
                e.setName(employee.getName());
                return;
            }
        }
    }

    @Override
    public Employee getEmployee(int id) {
       return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
