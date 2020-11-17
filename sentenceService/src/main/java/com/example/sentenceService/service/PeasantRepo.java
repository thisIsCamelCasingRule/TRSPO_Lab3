package com.example.sentenceService.service;

import com.example.sentenceService.model.Peasant;
import org.springframework.data.repository.CrudRepository;

public interface PeasantRepo extends CrudRepository<Peasant, Integer> {
    Peasant getPeasantByName(String name);
}
