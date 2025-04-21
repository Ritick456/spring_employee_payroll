package com.bridgelabz.employeepayroll.controller;


import com.bridgelabz.employeepayroll.dto.EmployeePay;
import com.bridgelabz.employeepayroll.entity.Employee;
import com.bridgelabz.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employeepayroll")
public class EmployeeController {

        @Autowired
        EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAlEmployee(){

        List<Employee> list = employeeService.getAllEmployee();
        return list;

    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){

        Optional<Employee> emp = employeeService.getEmployeeById(id);

        return emp;

    }


    @PostMapping
    public Employee createEmployee(@RequestBody EmployeePay request){

        Employee emp = employeeService.createEmployee(request);

        return emp;
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id , @RequestBody EmployeePay request){

            Employee emp = employeeService.updateEmployee(id , request);

            return emp;

    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable int id){

        return employeeService.deleteEmployee(id);

    }



}
