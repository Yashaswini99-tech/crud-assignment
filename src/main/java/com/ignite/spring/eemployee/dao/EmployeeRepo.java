package com.ignite.spring.eemployee.dao;

import com.ignite.spring.eemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
