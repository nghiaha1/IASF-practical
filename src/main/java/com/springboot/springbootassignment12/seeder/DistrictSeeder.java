package com.springboot.springbootassignment12.seeder;

import com.github.javafaker.Faker;
import com.springboot.springbootassignment12.entity.District;
import com.springboot.springbootassignment12.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class DistrictSeeder {
    @Autowired
    DistrictRepository districtRepository;
    public static List<District> districts;
    public static final int NUMBER_OF_DISTRICT = 5;


    public void DistrictSeeder() {
        Faker faker = new Faker();
        District district = new District();
        for (int i = 0; i < NUMBER_OF_DISTRICT; i++) {
            districts.add(District.builder()
                            .id(UUID.randomUUID().toString())
                            .name(faker.address().city())
                    .build());
        }
        districtRepository.saveAll(districts);
    }
}
