package com.example.SpringAPP;

import com.example.SpringAPP.model.Laptop;
import com.example.SpringAPP.service.LaptopService;
import org.springframework.boot .SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);
        LaptopService ls=context.getBean(LaptopService.class);
        Laptop lap=context.getBean(Laptop.class);
        ls.addLaptop(lap);
//        Alien a1=context.getBean(Alien.class);
//        a1.code();
//        a1.getCom().compile();
//        System.out.println(a1.getAge());
//        Laptop l1=context.getBean(Laptop.class);
//        l1.code();
        System.out.println("helllo");
	}

}
