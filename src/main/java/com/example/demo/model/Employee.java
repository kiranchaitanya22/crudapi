package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int employee_id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_city")
    private String city;

    @Column(name = "employee_start_date")
    private String start_date;

}
