package com.example.spring_data_jpa;

import com.example.spring_data_jpa.Repository.ChildrenRepo;
import com.example.spring_data_jpa.model.Children;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
        Children c1=context.getBean(Children.class);
        Children c2=context.getBean(Children.class);
        Children c3=context.getBean(Children.class);

        ChildrenRepo cr=context.getBean(ChildrenRepo.class);

//        c1.setRollno(10);
//        c1.setName("Alice");
//        c1.setAge(10);
//
//        c2.setRollno(20);
//        c2.setName("Bob");
//        c2.setAge(20);
//
//        c3.setRollno(30);
//        c3.setName("Charlie");
//        c3.setAge(30);
//
//        cr.save(c1);
//        cr.save(c2);
//        cr.save(c3);
        System.out.println(cr.findById(10));

	}

}
