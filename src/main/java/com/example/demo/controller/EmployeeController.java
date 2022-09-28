package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> employees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/id/{id}")
    public Optional<Employee> getEmployee(@PathVariable Integer id){

        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public void postEmployee(@RequestBody Employee employee){
        employeeService.insertEmployees(employee);
    }

    @DeleteMapping("/employee")
    public void deleteEmployee(@RequestParam(name = "id") Integer idVal){

        employeeService.deleteEmployee(idVal);
    }

    @PutMapping("/employee")
    public String putEmployee(@RequestBody Employee employee){
        return employeeService.putEmployee(employee);
    }
}
