package com.ignite.spring.eemployee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column(name="emp_id")
    private Integer empID;
    @Column(name="emp_name")
    private String empName;
    @Column(name="emp_email")
    private String empEmail;
    @Column(name="emp_org")
    private String empOrg;

    public Employee(){

    }
    public Employee(Integer empID, String empName, String empEmail, String empOrg) {
        this.empID = empID;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empOrg = empOrg;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpOrg() {
        return empOrg;
    }

    public void setEmpOrg(String empOrg) {
        this.empOrg = empOrg;
    }


}
