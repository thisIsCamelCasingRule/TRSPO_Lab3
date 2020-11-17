package com.example.sentenceService.service;

import com.example.sentenceService.model.Kingdom;
import org.springframework.data.repository.CrudRepository;


public interface KingdomRepo extends CrudRepository<Kingdom, Integer> {
    Kingdom getKingdomByName(String name);
}
