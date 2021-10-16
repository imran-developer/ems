package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "countries")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    private String name;

}
