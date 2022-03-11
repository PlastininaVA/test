package test.service;

import test.domain.Participant;


public interface ParticipantService {
    Participant createParticipant(String name);
    Participant getParticipantById(Long id);
    void deleteParticipant(Long id);
}