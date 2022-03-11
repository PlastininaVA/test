package test.service;

import test.domain.Prize;


public interface PrizeService {
    Prize createPrize(String description);
    Prize getPrizeById(Long id);
    void deletePrize(Long id);
}