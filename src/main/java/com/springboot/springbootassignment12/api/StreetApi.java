package com.springboot.springbootassignment12.api;

import com.springboot.springbootassignment12.entity.Street;
import com.springboot.springbootassignment12.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/streets")
public class StreetApi {
    @Autowired
    public StreetService streetService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Street>> findAll() {
        return ResponseEntity.ok(streetService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Street> create(@RequestBody Street obj) {
        return ResponseEntity.ok(streetService.save(obj));
    }
}
