package com.example.demo.controller;
import com.example.demo.modal.student;
import com.example.demo.service.implament.StudentServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @GetMapping("/student")
    public String index(){
        return  "hello student";
    }

    @Autowired
    StudentServicesImpl stService;

    @GetMapping("/student/{id}")
    public student getstudent(@PathVariable Integer id){
        return stService.GetStudent(id);
    }
}
