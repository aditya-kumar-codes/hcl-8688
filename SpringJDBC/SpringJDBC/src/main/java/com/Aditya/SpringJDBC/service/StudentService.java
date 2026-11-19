package com.Aditya.SpringJDBC.service;

import com.Aditya.SpringJDBC.Repository.StudentRepo;
import com.Aditya.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;
    @Autowired
    private JdbcTemplate jdbc;

//    public StudentRepo getRepo() {
//        return repo;
//    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getAllStudents() {
        String sql="Select * from stu";
        // Execute the query and return the results
        return jdbc.query(sql,(rs,rowNum)->{
            Student s=new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setAge(rs.getInt("age"));
            return s;
        });
//        return repo.findAll();
    }
}
