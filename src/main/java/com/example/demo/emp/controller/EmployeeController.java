package com.example.demo.emp.controller;

import com.example.demo.emp.persistence.Emp;
import com.example.demo.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/emp")
    public List<Emp> getEmployees() {
        return employeeService.getEmployess();
    }

    @GetMapping("/emp/{id}")
    public Emp getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/emp/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmp(id);
    }

    @PostMapping("/emp")
    public Emp createEmployee(@RequestBody Emp e) {
        return employeeService.saveOrUpdate(e);
    }
}
