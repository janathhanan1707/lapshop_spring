package com.laptopshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnore;

>>>>>>> d996974822b837555bc9e7ee3b978c138b245708
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity(name = "laptopshop")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name = "email",unique = true )
	private String email;
	
	@Column(name = "password",unique = false )
	private String password;
	
	private String moblie_no ;
	
	private String city;

}
