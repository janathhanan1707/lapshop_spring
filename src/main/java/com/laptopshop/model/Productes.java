package com.laptopshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "laptopview")
public class Productes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "lap_name ")
	private String lapName;

	@Column(name = "lap_specification ")
	private String lapSpecification;

	@Column(name = "lap_model")
	private String lapModel;

	private String price;

	private String rating;

	private String counts;

}
