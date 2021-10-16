package com.example.demo.Repository;

import com.example.demo.model.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CompaniesRepository extends JpaRepository<Companies, Id> {
}
