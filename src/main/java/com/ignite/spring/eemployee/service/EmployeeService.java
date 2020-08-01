package com.ignite.spring.eemployee.service;

import com.ignite.spring.eemployee.dao.EmployeeRepo;
import com.ignite.spring.eemployee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee findbyId(Integer id) {
        return employeeRepo.findById(id).get();
    }

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee createEmployee(Employee emp) {
        return employeeRepo.save(emp);
    }

    public Employee updateEmployeeById(int id, Employee emp) {
        emp.setEmpID(id);
        return employeeRepo.save(emp);
    }

    public void deleteEmployeeById(int id) {

        employeeRepo.deleteById(id);
    }

}

