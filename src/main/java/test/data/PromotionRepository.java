package test.data;

import test.domain.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long>, QuerydslPredicateExecutor<Promotion> {
    List<Promotion> findByType(Long id);
}