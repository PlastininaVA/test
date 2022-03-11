package test.service.impl;


import test.data.ParticipantRepository;
import test.domain.Participant;
import test.service.ParticipantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService {

    private final ParticipantRepository prizeRepository;


    @Override
    public Participant createParticipant(String name) {
        return null;
    }

    @Override
    public Participant getParticipantById(Long id) {
        return null;
    }

    @Override
    public void deleteParticipant(Long id) {

    }
}
