package com.example.demo.Repository;

import com.example.demo.model.States;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface StatesRepository extends JpaRepository<States, Id> {
}
