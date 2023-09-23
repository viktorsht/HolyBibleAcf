package com.mrsantos.holybibleacf.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "testament")
@Table(name = "testament")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class TestamentModel {

    public TestamentModel() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    
}