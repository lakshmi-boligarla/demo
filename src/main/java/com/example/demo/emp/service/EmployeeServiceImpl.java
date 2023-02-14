package com.example.demo.emp.service;

import com.example.demo.emp.persistence.Emp;
import com.example.demo.emp.persistence.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmpRepository empRepository;

    @Override
    public List<Emp> getEmployess() {
        return empRepository.findAll();
    }

    @Override
    public Emp getEmployee(int id) {
        return empRepository.findById(id).get();
    }

    @Override
    public Emp saveOrUpdate(Emp e) {
        return empRepository.save(e);
    }

    @Override
    public void deleteEmp(int id) {
        empRepository.deleteById(id);
    }
}
