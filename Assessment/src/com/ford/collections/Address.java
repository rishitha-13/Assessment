package com.ford.collections;

public class Address {
    Integer dNo;
    String street;
    String city;
    public Address() {
        super();
    }
    public Address(Integer dNo, String street, String city) {
        super();
        this.dNo = dNo;
        this.street = street;
        this.city = city;
    }
    public Integer getDNo() {
        return dNo;
    }
    public void setDoNo(Integer dNo) {
        this.dNo = dNo;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String toString() {
        return "Address dNo=" + dNo + ", street=" + street + ", city=" + city ;
    }
}
