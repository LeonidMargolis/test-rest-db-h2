package com.example.testrestdbh2.service;

import com.example.testrestdbh2.dao.StudentsDAO;
import com.example.testrestdbh2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentsService{

    @Autowired
    private StudentsDAO studentsDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents(){
        return studentsDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudents(int id) {return studentsDAO.getStudents(id);}

    @Override
    @Transactional
    public Student saveStudents(Student student) {return studentsDAO.saveStudents(student);}

    @Override
    @Transactional
    public void deleteStudents(int id) { studentsDAO.deleteStudents(id);}
}
