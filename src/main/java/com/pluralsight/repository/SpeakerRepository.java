package com.pluralsight.repository;

import com.pluralsigth.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
