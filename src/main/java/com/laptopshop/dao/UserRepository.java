package com.laptopshop.dao;

<<<<<<< HEAD
import java.util.Optional;

=======
>>>>>>> d996974822b837555bc9e7ee3b978c138b245708
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptopshop.model.User;
@Repository
public interface  UserRepository extends JpaRepository<User,Integer> {
	
	@SuppressWarnings("unchecked")
	User save(User user);

<<<<<<< HEAD
	Optional<User> findByEmailAndPassword(String email, String password);	
=======
	//User findByEmailAndPassword(String email, String password);

	

	//void changePassword(Integer id, String password);

	
	
	
>>>>>>> d996974822b837555bc9e7ee3b978c138b245708
}
