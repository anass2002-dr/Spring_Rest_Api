package com.example.demo.service.implament;

import com.example.demo.modal.student;
import com.example.demo.repository.StudentRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServicesImpl implements StudentService {

    @Autowired
    StudentRepository strep;

    @Override
    public List<student> GetAllStudent() {
        return strep.findAll();
    }

    @Override
    public student InsertStudent(student student) {
        return strep.save(student);
    }

    @Override
    public student GetStudent(Integer id) {
        return strep.findById(id).get();
    }

    @Override
    public student UpdateStudent(student student) {
        return strep.save(student);
    }

    @Override
    public void DeleteStudent(student student) {
        strep.delete(student);
    }

    @Override
    public List<student> AddListOfStudent(List<student> ListStudent) {
        return strep.saveAll(ListStudent);
    }


}
