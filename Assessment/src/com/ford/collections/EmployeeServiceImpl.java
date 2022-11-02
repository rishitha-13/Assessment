package com.ford.collections;

import java.util.ArrayList;
import java.util.List;


public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> employees = new ArrayList<>();
    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);

    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {

        System.out.println("Get EmployeeById" +employees.get(employeeId));
            return employees.get(employeeId);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employees.set(2,employee);
        System.out.println("Update Employee:" +employees);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
         employees.remove(employeeId);

        System.out.println("Delete Employee Id: "+employees);
        }
        


    @Override
    public List<Employee> getAllEmployees() {
      System.out.println( "All the Employees " +employees);
        return employees;

    }
}
