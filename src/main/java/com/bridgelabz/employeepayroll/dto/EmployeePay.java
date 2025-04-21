package com.bridgelabz.employeepayroll.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeePay {

    private int id;
    private String name;
    private BigDecimal salary;
    private LocalDate startDate;
    private String phoneNumber;
    private char gender;

    // Constructors
    public EmployeePay() {
    }

    public EmployeePay(int id , String name, BigDecimal salary, LocalDate startDate, String phoneNumber, char gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    // Getters and Setters
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return  id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }



}
