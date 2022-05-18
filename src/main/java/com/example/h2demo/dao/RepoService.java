package com.example.h2demo.dao;

import com.example.h2demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepoService{
    private final EmployeeRepo employeeRepo;

    public RepoService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public void addEmp(int id, String name){
        Employee e = new Employee(id, name);
        employeeRepo.save(e);
    }

    public List<Employee> getAllEmp(){
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmpById(int id){
        return employeeRepo.findById(id);
    }

    public String deleteData(int id){
        if(employeeRepo.findById(id).isPresent()){
            employeeRepo.deleteById(id);
            return "Data For ID: "+id+" Deleted";
        }

        return "Employee Not Found";
    }
}
