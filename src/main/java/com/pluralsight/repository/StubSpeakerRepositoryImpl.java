package com.pluralsight.repository;

import com.pluralsigth.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Renan");
        speaker.setLastName("Prazeres");

        speakers.add(speaker);

        return speakers;
    }
}
