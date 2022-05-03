package com.laptopshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import com.laptopshop.model.Productes;

@Repository
public interface ProductesRepository extends JpaRepository<Productes,Integer> {
	
=======

import com.laptopshop.model.Productes;

public interface ProductesRepository extends JpaRepository<Productes,Integer> {
	
	@SuppressWarnings("unchecked")
	Productes save(Productes productes) ; 
	
	
>>>>>>> d996974822b837555bc9e7ee3b978c138b245708

}
