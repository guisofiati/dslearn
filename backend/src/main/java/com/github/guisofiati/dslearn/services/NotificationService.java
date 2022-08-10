package com.github.guisofiati.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.guisofiati.dslearn.dto.NotificationDTO;
import com.github.guisofiati.dslearn.entities.Notification;
import com.github.guisofiati.dslearn.entities.User;
import com.github.guisofiati.dslearn.repositories.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable) {
		User user = authService.authenticated();
		Page<Notification> page = repository.findNotificationByUser(user, pageable);
		return page.map(x -> new NotificationDTO(x));
	}
}
