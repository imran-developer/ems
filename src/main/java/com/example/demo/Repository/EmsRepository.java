package com.example.demo.Repository;

import com.example.demo.model.Ems;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface EmsRepository extends JpaRepository<Ems, Id> {
}
