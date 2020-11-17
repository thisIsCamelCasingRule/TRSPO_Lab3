package com.example.kingdomService.service;

import com.example.kingdomService.model.Kingdom;
import org.springframework.data.repository.CrudRepository;


public interface KingdomRepo extends CrudRepository<Kingdom, Integer> {
    Kingdom getKingdomByName(String name);
}
