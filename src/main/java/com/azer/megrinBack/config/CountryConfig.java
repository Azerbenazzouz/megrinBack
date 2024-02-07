package com.azer.megrinBack.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import com.azer.megrinBack.entities.Country;
import com.azer.megrinBack.repository.CountryRepository;

@Configuration
public class CountryConfig {

    @Bean
    CommandLineRunner CountryCommandLineRunner(CountryRepository repository) {
        return args -> {
            // Country tunisia = new Country("Tunisia","tn","https://flagcdn.com/256x192/tn.webp");
            // repository.save(tunisia);
        };
    }


}
