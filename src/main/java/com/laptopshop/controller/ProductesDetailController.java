package com.laptopshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.dao.ProductesRepository;
import com.laptopshop.model.Productes;

@RestController
public class ProductesDetailController {
	
	@Autowired
	ProductesRepository productesRepository;
	
	@GetMapping("Productes/list")
	public List<Productes> getAllUsers() {
		List<Productes> userList = productesRepository.findAll();
		return userList;
	}
	
	@PostMapping ("Productes/addproductes")
	public  Object addProductes(@RequestBody Productes productes) {
		return productesRepository.save(productes);
		
		
	}
	
	
	

}
