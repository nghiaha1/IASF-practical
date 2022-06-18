package com.springboot.springbootassignment12.seeder;

import com.github.javafaker.Faker;
import com.springboot.springbootassignment12.entity.District;
import com.springboot.springbootassignment12.entity.Street;
import com.springboot.springbootassignment12.entity.enums.StreetSimpleStatus;
import com.springboot.springbootassignment12.repository.StreetRepository;
import com.springboot.springbootassignment12.util.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
@Component
@Slf4j
public class StreetSeeder {
    @Autowired
    StreetRepository streetRepository;
    public static List<Street> streets;
    public static final int NUMBER_OF_STREET = 100;

    public void StreetSeeder() {
        Faker faker = new Faker();
        streets = new ArrayList<>();
        int randomDistrictIndex = NumberUtil.getRandomNumberUsingInts(0, DistrictSeeder.NUMBER_OF_DISTRICT -1);
        District district = DistrictSeeder.districts.get(randomDistrictIndex);
        for (int i = 0; i < NUMBER_OF_STREET; i++) {
            Street street = new Street();
            street.setId(UUID.randomUUID().toString());
            street.setName(faker.address().streetName());
            street.setDescription(faker.lorem().sentence(200));
            street.setDistrictId(district.getId());
            street.setStatus(StreetSimpleStatus.USING);
            streets.add(street);
        }
        streetRepository.saveAll(streets);
    }
}
