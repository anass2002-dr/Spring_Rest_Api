package com.example.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_student;

    private String firstName;
    private String lastName;
    private Integer age;
}
