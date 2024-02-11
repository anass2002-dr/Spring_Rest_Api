package com.example.demo.service.implament;

import com.example.demo.modal.student;

import java.util.List;

public interface StudentService {
    public student GetStudent(Integer id);
    public List<student> GetAllStudent();
    public student InsertStudent(student student);
    public void DeleteStudent(Integer id);

    public List<student> AddListOfStudent(List<student> ListStudent);
    public student UpdateStudent(student student);
}
