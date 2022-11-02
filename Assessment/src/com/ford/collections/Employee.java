package com.ford.collections;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    Address address;
    public Employee() {
        super();
    }
    public Employee(Integer id,String name,Double salary,Address address){
        super();
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
    public void setId(Integer id) {
        this.id=id;
    }
    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
    }


}
