package com.Aditya.SpringJDBC;

import com.Aditya.SpringJDBC.model.Student;
import com.Aditya.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcApplication.class, args);
        Student s1=context.getBean(Student.class);
        StudentService service=context.getBean(StudentService.class);
//        s1.setName("Aditya Kumar sharma");
//        s1.setId(2);
//        s1.setAge(21);
//        service.addStudent(s1);
        List<Student> students=service.getAllStudents();
        for(Student s:students){
            System.out.println(s);
        }
	}

}
