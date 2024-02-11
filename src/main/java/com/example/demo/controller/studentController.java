package com.example.demo.controller;
import com.example.demo.modal.student;
import com.example.demo.service.implament.StudentServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class studentController {
    @GetMapping("/")
    public String index(){
        return  "hello this is student controller";
    }

    @Autowired
    StudentServicesImpl stService;

    @GetMapping("/{id}")
    public student getstudent(@PathVariable Integer id){
        return stService.GetStudent(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        stService.DeleteStudent(id);
    }
}
