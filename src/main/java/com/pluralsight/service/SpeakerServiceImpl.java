package com.pluralsight.service;

import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImpl;
import com.pluralsigth.model.Speaker;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {


    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    private SpeakerRepository repository = new StubSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
