package com.laptopshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "laptopview")
public class Productes {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;	
	@Column(name = "lap_name ")
	private String lapName;
	
	private String lap_specification;
	
	private String lap_model;
	
	private String price ;
	
	private String rating ;
	
	private String counts;

}
