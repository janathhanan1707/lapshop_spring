package com.laptopshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.dao.ProductesRepository;

@RestController
public class ProductesDetailController {
	
	@Autowired
	ProductesRepository productesRepository;
	
	
	
	
	

}
