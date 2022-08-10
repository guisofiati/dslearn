package com.github.guisofiati.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.guisofiati.dslearn.entities.Deliver;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long>{

}
