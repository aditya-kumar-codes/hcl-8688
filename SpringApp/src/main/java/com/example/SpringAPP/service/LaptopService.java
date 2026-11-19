package com.example.SpringAPP.service;

import com.example.SpringAPP.model.Laptop;
import com.example.SpringAPP.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository lap;

    public void addLaptop(Laptop laptop)
    {
//        System.out.println("Laptop added successfully");
        lap.save(laptop);

    }
    public boolean isGood(Laptop laptop)
    {
        return true;
    }
}
