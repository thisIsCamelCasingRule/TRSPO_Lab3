package com.example.demo.service;

import com.example.demo.model.Kingdom;
import org.springframework.data.repository.CrudRepository;

public interface KingdomRepo extends CrudRepository<Kingdom, Integer> {
    Kingdom getKingdomByName(String name);
}
