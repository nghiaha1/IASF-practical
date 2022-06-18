package com.springboot.springbootassignment12.service;

import com.springboot.springbootassignment12.entity.District;
import com.springboot.springbootassignment12.entity.Street;
import com.springboot.springbootassignment12.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StreetService {
    @Autowired
    StreetRepository streetRepository;

    public Iterable<Street> findAll() {
        return streetRepository.findAll();
    }

    public Street save(Street obj) {
        return streetRepository.save(obj);
    }
}
