package com.example.h2demo.controller;

import com.example.h2demo.dao.RepoService;
import com.example.h2demo.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    private final RepoService repoService;

    public HomeController(RepoService repoService) {
        this.repoService = repoService;
    }

    @RequestMapping("/")
    public String home(){
        String s = "Execute http://localhost:8080/addData?id=101&name=Test To Save A Data\n" +
                "http://localhost:8080/fetchData To Fetch All Data\n" +
                "http://localhost:8080/fetchById/{id} And Pass An ID To Fetch Data By ID\n" +
                "http://localhost:8080/deleteById/{id} And Pass An ID To Delete Data By ID";

        return s;
    }

    @RequestMapping("/addData")
    public String addEmp(Employee employee){
        //http://localhost:8080/addData?id=101&name=Test
        repoService.addEmp(employee);
        return "Data Added";
    }

    @RequestMapping("/fetchData")
    public List<Employee> fetchData(){
        //http://localhost:8080/fetchData
        return repoService.getAllEmp();

    }

    @RequestMapping("/fetchById/{id}")
    public Optional<Employee> fetchById(@PathVariable int id){
        //http://localhost:8080/fetchById/{id}
        return repoService.getEmpById(id);
    }

    @RequestMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        //http://localhost:8080/deleteById/{id}
        return repoService.deleteData(id);
    }
}
