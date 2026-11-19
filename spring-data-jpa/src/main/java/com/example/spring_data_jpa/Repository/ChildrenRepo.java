package com.example.spring_data_jpa.Repository;

import com.example.spring_data_jpa.model.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepo extends JpaRepository<Children, Integer> {
}
