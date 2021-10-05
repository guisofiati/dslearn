package github.guisofiati.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.guisofiati.dslearn.entities.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long>{
}