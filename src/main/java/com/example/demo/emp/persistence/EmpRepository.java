package com.example.demo.emp.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
}
