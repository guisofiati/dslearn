package com.github.guisofiati.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.guisofiati.dslearn.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
