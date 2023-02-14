package com.example.demo.emp.service;

import com.example.demo.emp.persistence.Emp;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Emp> getEmployess();

    Emp getEmployee(int id);

    Emp saveOrUpdate(Emp e);

    void deleteEmp(int id);

}