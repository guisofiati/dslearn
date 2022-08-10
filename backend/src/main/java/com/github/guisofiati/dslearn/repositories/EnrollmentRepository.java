package com.github.guisofiati.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.guisofiati.dslearn.entities.Enrollment;
import com.github.guisofiati.dslearn.entities.pk.EnrollmentPK;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK>{

}
