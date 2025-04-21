package com.bridgelabz.employeepayroll.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "employee_pay") // Replace with your actual table name
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100)
    private String name;

    @Column(precision = 10, scale = 2)
    private BigDecimal salary;

    private LocalDate startDate;

    @Column(name = "phone_Number", length = 100)
    private String phoneNumber;

    private char gender;

    // Constructors
    public Employee() {
    }

    public Employee(String name, BigDecimal salary, LocalDate startDate, String phoneNumber, char gender) {
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
