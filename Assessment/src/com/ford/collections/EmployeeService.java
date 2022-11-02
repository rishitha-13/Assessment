package com.ford.collections;

import java.util.List;

public interface EmployeeService {
    //CRUD
    void addEmployee(Employee employee);
    Employee getEmployeeById(Integer employeeId);
    void updateEmployee(Employee employee);
    void deleteEmployeeById(Integer employeeId);
    //Get all employee details
    List<Employee> getAllEmployees();
}
