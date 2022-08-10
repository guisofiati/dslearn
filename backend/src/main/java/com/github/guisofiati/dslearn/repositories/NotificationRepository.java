package com.github.guisofiati.dslearn.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.guisofiati.dslearn.entities.Notification;
import com.github.guisofiati.dslearn.entities.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{

	Page<Notification> findNotificationByUser(User user, Pageable pageable);
}
