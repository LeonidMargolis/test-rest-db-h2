package com.example.testrestdbh2.dao;


import com.example.testrestdbh2.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Slf4j
@Repository
public class StudentsDAOImpl implements StudentsDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> getAllStudents(){

        Query query = entityManager.createQuery("from Student");
        List<Student> allStudents = query.getResultList();
        log.info("getAllStudents" + allStudents);
        return allStudents;


    }

    @Override
    public Student saveStudents(Student student){
        return entityManager.merge(student);
    }

    @Override
    public Student getStudents(int id){

        return entityManager.find(Student.class, id);
    }
    @Override
    public void deleteStudents(int id){
        Query query =entityManager.createQuery("delete from Student where id =:studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
    }
}
