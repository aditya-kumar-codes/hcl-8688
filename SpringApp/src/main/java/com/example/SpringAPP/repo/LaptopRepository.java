package com.example.SpringAPP.repo;

import com.example.SpringAPP.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("Laptop saved successfully");
    }

}
