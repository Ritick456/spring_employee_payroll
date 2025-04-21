package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeePay;
import com.bridgelabz.employeepayroll.entity.Employee;
import com.bridgelabz.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){

        return employeeRepository.findAll();

    }

    public Optional<Employee> getEmployeeById(int id){

        return employeeRepository.findById(id);

    }

    public Employee createEmployee(EmployeePay request){

        Employee emp = new Employee();

        emp.setId(request.getId());
        emp.setGender(request.getGender());
        emp.setName(request.getName());
        emp.setSalary(request.getSalary());
        emp.setStartDate(request.getStartDate());
        emp.setPhoneNumber(request.getPhoneNumber());

        return employeeRepository.save(emp);
    }

    public Employee updateEmployee(int id , EmployeePay request){

        Optional<Employee> opEmp = employeeRepository.findById(id);

        if(opEmp.isPresent()){

            Employee emp = opEmp.get();


            emp.setGender(request.getGender());
            emp.setName(request.getName());
            emp.setSalary(request.getSalary());
            emp.setPhoneNumber(request.getPhoneNumber());
            emp.setStartDate(request.getStartDate());

            return employeeRepository.save(emp);
        }

        return null;

    }

    public boolean deleteEmployee(int id){

        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }

    }
}
