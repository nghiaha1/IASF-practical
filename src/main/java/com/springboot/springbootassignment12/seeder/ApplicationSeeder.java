package com.springboot.springbootassignment12.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ApplicationSeeder implements CommandLineRunner {
    private boolean createNewSeed = true;
    @Autowired
    StreetSeeder streetSeeder;
    @Autowired
    DistrictSeeder districtSeeder;

    @Override
    public void run(String... args) throws Exception {
        if (createNewSeed) {
            districtSeeder.DistrictSeeder();
            streetSeeder.StreetSeeder();
        }
    }
}
