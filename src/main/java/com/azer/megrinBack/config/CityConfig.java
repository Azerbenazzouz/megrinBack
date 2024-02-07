package com.azer.megrinBack.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.azer.megrinBack.repository.CityRepository;

@Configuration
public class CityConfig {

    @Bean
    CommandLineRunner commandLineRunner(CityRepository repository) {
        return args -> {
            // City NM1 = new City("Nouvelle Madina 1", 1L);
            // City NM2 = new City("Nouvelle Madina 2", 1L);
            // City NM3 = new City("Nouvelle Madina 3", 1L);
            
            // repository.saveAll(
            //         List.of(NM1, NM2, NM3)
            // );
        };
    }
}
