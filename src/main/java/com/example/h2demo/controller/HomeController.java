package com.example.h2demo.controller;

import com.example.h2demo.dao.RepoService;
import com.example.h2demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    private final RepoService repoService;

    public HomeController(RepoService repoService) {
        this.repoService = repoService;
    }

    @PutMapping("/addData")
    public String addEmp(@Valid @RequestParam int id,
                         @Valid @RequestParam String name){
        repoService.addEmp(id, name);
        return id + "," + name + " Added to the Database";
    }

    @GetMapping("/fetchAll")
    public List<Employee> fetchData(){
        return repoService.getAllEmp();

    }

    @GetMapping("/fetchById")
    public Optional<Employee> fetchById(@RequestParam int id){
        return repoService.getEmpById(id);
    }

    @DeleteMapping("/deleteById")
    public String deleteById(@RequestParam int id){
        return repoService.deleteData(id);
    }
}
