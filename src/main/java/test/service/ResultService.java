package test.service;

import test.domain.Result;


public interface ResultService {
    Result createResult(Long winnerId, Long prizeId);
    Result getResultById(Long id);
    void deleteResult(Long id);
}