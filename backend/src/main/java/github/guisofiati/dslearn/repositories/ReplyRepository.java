package github.guisofiati.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import github.guisofiati.dslearn.entities.Reply;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long>{
}