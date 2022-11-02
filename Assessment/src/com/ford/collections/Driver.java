package com.ford.collections;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String []args){

        EmployeeService demo= new EmployeeServiceImpl();
        // Add Employee to List
        demo.addEmployee(new Employee(1,"AA",10000.0, new Address(11,"Sun","Bangalore")));
        demo.addEmployee(new Employee(2,"EE",25000.0, new Address(22,"Rajiv","Hyderabad")));
        demo.addEmployee(new Employee(3,"WW",50000.0, new Address(33,"Gandhi","Chennai")));
        demo.addEmployee(new Employee(5,"TT",19330.0, new Address(34,"LBNagar","Hyderabad")));
       demo.getEmployeeById(3);
        demo.updateEmployee(new Employee(7,"RR",20000.0, new Address(88,"VL Road","Vijayawada")));
        demo.deleteEmployeeById(2);
        demo.getAllEmployees();


    }
}
