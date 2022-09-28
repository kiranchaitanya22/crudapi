package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.Product;
import com.example.demo.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    public IEmployeeRepo employeeRepo;

    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(int id){

        return employeeRepo.findById(id);
    }

    public void insertEmployees(Employee employee){
        employeeRepo.save(employee);
    }

    public void deleteEmployee(int id){
        employeeRepo.deleteById(id);
    }

    public String putEmployee(Employee employee){
        int employeeId=employee.getEmployee_id();
        if(employeeRepo.existsById(employeeId)){
            employeeRepo.save(employee);
            return "Succesful";
        }
        return "Not succesful";

    }
}
