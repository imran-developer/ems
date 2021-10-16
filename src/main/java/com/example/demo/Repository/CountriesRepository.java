package com.example.demo.Repository;

import com.example.demo.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CountriesRepository extends JpaRepository<Countries, Id> {
}
