package com.laptopshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptopshop.model.Productes;

@Repository
public interface ProductesRepository extends JpaRepository<Productes,Integer> {
	

}
