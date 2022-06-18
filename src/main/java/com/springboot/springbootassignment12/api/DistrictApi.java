package com.springboot.springbootassignment12.api;

import com.springboot.springbootassignment12.entity.District;
import com.springboot.springbootassignment12.repository.DistrictRepository;
import com.springboot.springbootassignment12.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/districts")
public class DistrictApi {
    @Autowired
    public DistrictService districtService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<District>> findAll() {
        return ResponseEntity.ok(districtService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<District> save(@RequestBody District obj) {
        return ResponseEntity.ok(districtService.save(obj));
    }
}
