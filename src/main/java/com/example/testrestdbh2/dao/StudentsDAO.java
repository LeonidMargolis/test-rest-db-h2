package com.example.testrestdbh2.dao;

import com.example.testrestdbh2.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsDAO {

    List<Student> getAllStudents();

    Student saveStudents(Student student);

    Student getStudents(int id);

    void deleteStudents(int id);
}
