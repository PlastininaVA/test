package test.data;

import test.domain.Prize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PrizeRepository extends JpaRepository<Prize, Long>, QuerydslPredicateExecutor<Prize> {
    List<Prize> findByType(Long id);
}