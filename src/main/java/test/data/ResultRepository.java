package test.data;

import test.domain.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ResultRepository extends JpaRepository<Result, Long>, QuerydslPredicateExecutor<Result> {
    List<Result> findByType(Long id);
}