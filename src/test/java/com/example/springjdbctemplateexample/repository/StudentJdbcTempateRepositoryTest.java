package com.example.springjdbctemplateexample.repository;

import com.example.springjdbctemplateexample.controller.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentJdbcTempateRepositoryTest {
  @Autowired
  @Qualifier("studentJdbcTemplateRepository")
  private StudentRepository studentRepository;

  @Test
  void insertTest() {
    Student student = new Student();
    student.setName("장이수");
    student.setAge(40);
    student.setAddress("제주도");
    studentRepository.insertStudent(student);
  }

  @Test
  void selectTest() {
    List<Student> list = studentRepository.findAll();
    for (Student student : list) {
      System.out.println(student.getId());
      System.out.println(student.getName());
      System.out.println(student.getAge());
      System.out.println(student.getAddress());
    }
  }
}
