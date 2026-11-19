package com.example.RestAPI;

import com.example.RestAPI.model.JobPost;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(RestApiApplication.class, args);
        JobPost j1=context.getBean(JobPost.class);
        JobPost j2=context.getBean(JobPost.class);
        JobPost j3=context.getBean(JobPost.class);
        JobPost j4=context.getBean(JobPost.class);
        JobPost j5=context.getBean(JobPost.class);

        System.out.println("heelo");
	}

}
