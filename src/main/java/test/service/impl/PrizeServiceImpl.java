package test.service.impl;


import test.data.PrizeRepository;
import test.domain.*;
import test.service.PrizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class PrizeServiceImpl implements PrizeService {

    private final PrizeRepository prizeRepository;

    @Override
    public Prize createPrize(String description) {
        Prize prize = new Prize(description);
        return prizeRepository.save(prize);
    }

    @Override
    public Prize getPrizeById(Long id) {
        return null;
    }

    @Override
    public void deletePrize(Long id) {

    }
}
