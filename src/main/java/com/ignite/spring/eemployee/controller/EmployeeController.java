package com.ignite.spring.eemployee.controller;

import com.ignite.spring.eemployee.model.Employee;
import com.ignite.spring.eemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public  Employee getEmployee(@PathVariable Integer id){
    return employeeService.findbyId(id);
    }
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }
    @PostMapping("/employee")
    public  Employee createEmployee(@RequestBody Employee emp) {
        return employeeService.createEmployee(emp);
    }


    @PutMapping(value = "/employee/{id}")
    public Employee updateEmployeeById(@PathVariable("id") int id, @RequestBody Employee emp) {
        return employeeService.updateEmployeeById(id, emp);
    }
    @DeleteMapping(value = "/employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") int id) {
        employeeService.deleteEmployeeById(id);
        return "Employee with id " + id + " has been deleted!";

    }

    }



