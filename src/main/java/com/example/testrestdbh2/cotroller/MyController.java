package com.example.testrestdbh2.cotroller;

import com.example.testrestdbh2.entity.Student;
import com.example.testrestdbh2.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/students")
    public List<Student> showAllStudents(){
        return studentsService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudents (@PathVariable("id") int id) { return studentsService.getStudents(id); }

    @PostMapping("students")
    public Student saveStudents(@RequestBody Student student) { return studentsService.saveStudents(student);}

    @PutMapping("/students")
    public Student updateStudents(@RequestBody Student student) {
        studentsService.saveStudents(student);
        return student;
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudents(@PathVariable("id") int id) {studentsService.deleteStudents(id);}
}
