package test.service;

import test.domain.Promotion;
import test.dto.PromotionDto;


public interface PromotionService {
    Promotion createPromotion(String description);
    Long createPromotion(PromotionDto promotionDto);

    Promotion getPromotionById(Long id);
    void deletePromotion(Long id);
}