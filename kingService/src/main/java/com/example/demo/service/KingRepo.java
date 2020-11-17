package com.example.demo.service;

import com.example.demo.model.King;
import org.springframework.data.repository.CrudRepository;

public interface KingRepo extends CrudRepository<King, Integer> {
    King getKingByName(String name);
}
