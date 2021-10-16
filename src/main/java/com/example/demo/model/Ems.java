package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="ems")
public class Ems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    private String EmployeeName;

    @OneToOne
    @JoinColumn(name="companies_id")
    private Companies companies;


    @OneToOne
    @JoinColumn(name="countries_id")
    private Countries countries;

    @OneToOne
    @JoinColumn(name="states_id")
    private States states;

    @OneToOne
    @JoinColumn(name="cities_id")
    private Cities cities;

    private String Designation;



}
