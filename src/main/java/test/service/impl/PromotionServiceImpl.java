package test.service.impl;


import test.data.PromotionRepository;
import test.domain.Promotion;
import test.dto.PromotionDto;
import test.service.PromotionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class PromotionServiceImpl implements PromotionService {

    private final PromotionRepository promotionRepository;


    @Override
    public Promotion createPromotion(String description) {
        return null;
    }

    @Override
    public Long createPromotion(PromotionDto promotionDto) {
        Promotion promotion = new Promotion(promotionDto);
        return promotionRepository.save(promotion).getId();
    }

    @Override
    public Promotion getPromotionById(Long id) {
        return null;
    }

    @Override
    public void deletePromotion(Long id) {

    }
}
