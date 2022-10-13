package com.example.testrestdbh2.service;

import com.example.testrestdbh2.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentsService {

    List<Student> getAllStudents();

    Student saveStudents(Student student);

    Student getStudents(int id);

    void deleteStudents(int id);
}


