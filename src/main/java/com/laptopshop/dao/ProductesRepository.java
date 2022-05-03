package com.laptopshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


	


import com.laptopshop.model.Productes;

public interface ProductesRepository extends JpaRepository<Productes,Integer> {
	
	@SuppressWarnings("unchecked")
	Productes save(Productes productes) ; 
	


}
