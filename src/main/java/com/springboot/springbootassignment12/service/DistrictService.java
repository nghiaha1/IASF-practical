package com.springboot.springbootassignment12.service;

import com.springboot.springbootassignment12.entity.District;
import com.springboot.springbootassignment12.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DistrictService {
    @Autowired
    DistrictRepository districtRepository;
    public Iterable<District> findAll() {
        return districtRepository.findAll();
    }

    public District save(District obj) {
        return districtRepository.save(obj);
    }
}
