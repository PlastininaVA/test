package test.data;

import test.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long>, QuerydslPredicateExecutor<Participant> {
    List<Participant> findByType(Long id);
}