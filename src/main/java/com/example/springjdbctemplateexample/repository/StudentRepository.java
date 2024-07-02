package com.example.springjdbctemplateexample.repository;

import com.example.springjdbctemplateexample.controller.domain.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository {
    List<Student> findAll();

    int insertStudent(Student student);
}
