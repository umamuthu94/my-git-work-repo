package com.example.SpringbootGit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootGit.model.Employee;
import com.example.SpringbootGit.repo.EmployeeRepo;

@RestController
public class EmployeeController {
     @Autowired
    private EmployeeRepo repo;

    @PostMapping("/saveEmp")
    public String saveEmp(@RequestBody Employee employee){
        repo.save(employee);
        return "Employee saved...";
    }

    @GetMapping("/AllEmp")
    public List<Employee> getAll(){
        return repo.findAll();
    }

    
     @GetMapping("/findEmp/{dept}")
   public List<Employee> getEmpByDept(@RequestParam String dept) {
      return repo.findByDept(dept);
   }
    
}
