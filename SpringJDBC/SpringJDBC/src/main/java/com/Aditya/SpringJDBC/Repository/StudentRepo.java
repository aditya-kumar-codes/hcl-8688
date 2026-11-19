package com.Aditya.SpringJDBC.Repository;

import com.Aditya.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        // Implementation for saving a student
        String sql="insert into stu(id, name, age) values (?, ?, ?)";
        jdbc.update(sql, s.getId(), s.getName(), s.getAge());
        System.out.println("Student Added to the database" );
    }

    public List<Student> findAll() {
//        List<Student> st= new ArrayList<Student>();
//        return st;
        String sql="Select * from stu";
        RowMapper<Student> rowMapper=new RowMapper<Student>(){
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s=new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                return s;
            }
        };
        return jdbc.query(sql, rowMapper);
    }
}