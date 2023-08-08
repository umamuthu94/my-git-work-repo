package com.example.SpringbootGit.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootGit.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

        List<Employee> findByDept(String dept);
    
        Optional<Employee> findById(Long id);
        
    }

