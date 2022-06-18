package com.springboot.springbootassignment12.repository;

import com.springboot.springbootassignment12.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, String> {
}
