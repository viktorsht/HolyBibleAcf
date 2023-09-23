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

@Entity(name = "verses")
@Table(name="verses")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class VersesModel {

    public VersesModel(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String version;
    private int testament;
    private int book;
    private int chapter;
	private int verse;
	private String text;
    
}
