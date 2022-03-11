package test.service.impl;


import test.data.ResultRepository;
import test.domain.Result;
import test.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class ResultServiceImpl implements ResultService {

    private final ResultRepository resultRepository;

    @Override
    public Result createResult(Long winnerId, Long prizeId) {
        return null;
    }

    @Override
    public Result getResultById(Long id) {
        return null;
    }

    @Override
    public void deleteResult(Long id) {

    }
}
