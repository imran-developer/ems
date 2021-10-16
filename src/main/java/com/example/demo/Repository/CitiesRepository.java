package com.example.demo.Repository;

import com.example.demo.model.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CitiesRepository extends JpaRepository<Cities, Id> {
}
