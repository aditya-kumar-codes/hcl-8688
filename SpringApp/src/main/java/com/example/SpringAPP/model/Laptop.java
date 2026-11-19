package com.example.SpringAPP.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
//    //public void code()
//    {
//        System.out.println("compiling...");
//    }

    public void compile() {
        System.out.println("compiling...thorugh laptop");
    }
}
