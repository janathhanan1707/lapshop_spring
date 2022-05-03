package com.laptopshop.controller;


import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptopshop.dao.UserRepository;
import com.laptopshop.model.User;


@RestController
public class UserDetailControlle {
	

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("users/register")
	public User register(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("moblie_no") String moblie_no,
			@RequestParam("city")String city){
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMoblie_no(moblie_no);
		user.setCity(city);
		
		//save
		User userObj = userRepository.save(user);
		return userObj;
	}
	
	@PostMapping("users/register")
	public User register(@RequestBody User user) {
		User userObj = userRepository.save(user);
		return userObj;
	}

	@PostMapping("users/login")
	public User login (@RequestBody User user) throws Exception {
		Optional<User> userObj = userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
		if(userObj.isPresent()) {
			
		return userObj.get();
		}
		else {
		return null;
	
	}
	}
	@PostMapping("users/list")

	@GetMapping("users/login")
	public User login(
			@RequestParam("email") String email,
			@RequestParam("password") String password) {
		User user = null;//userRepository.findByEmailAndPassword(email, password);
		if(user == null) {
			//throw new Exception("Invalid Login Credentials");
		}
		return user;
	
	}
	
	@GetMapping("users/list")

	public List<User> getAllUsers() {
		List<User> userList = userRepository.findAll();
		return userList;
	}
	
	@GetMapping("users/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		userRepository.deleteById(id);		 
	}
	

	@GetMapping("users/change-password/{id}")
	public void changePassword(@PathVariable("id") Integer id, @RequestParam("password") String password) {
		userRepository.changePassword(id, password);
	}

}




	
	
