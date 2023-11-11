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

@Entity(name = "about")
@Table(name="about")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class AboutModel {

    public AboutModel(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String project_name;
    private String abbreviation;
    private String app_version;
    private String description;
	private String bible_version;
	private String social_media;
    
}
