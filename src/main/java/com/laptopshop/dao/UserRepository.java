package com.laptopshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptopshop.model.User;
@Repository
public interface  UserRepository extends JpaRepository<User,Integer> {
	
	@SuppressWarnings("unchecked")
	User save(User user);

	//User findByEmailAndPassword(String email, String password);

	

	//void changePassword(Integer id, String password);

	
	
	
}
