package com.example.SpringAPP.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
//    //public void code()
//    {
//        System.out.println("compiling...");
//    }

    public void compile() {
        System.out.println("compiling...thorugh Desktop");
    }
}
