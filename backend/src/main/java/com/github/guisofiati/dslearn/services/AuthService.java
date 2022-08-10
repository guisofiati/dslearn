package com.github.guisofiati.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.guisofiati.dslearn.entities.User;
import com.github.guisofiati.dslearn.repositories.UserRepository;
import com.github.guisofiati.dslearn.services.exceptions.ForbiddenException;
import com.github.guisofiati.dslearn.services.exceptions.UnauthorizedException;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	// quem é o user que esta autenticado
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName(); // pegar nome do user
			return userRepository.findByEmail(username); 
		}
		catch (Exception e) {
			throw new UnauthorizedException("Invalid user");
		}
	}
	
	// ver se o proprio user ou admin
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) { // se n for o user indicado OU admin
			throw new ForbiddenException("Access denied");
		}
	}

}
