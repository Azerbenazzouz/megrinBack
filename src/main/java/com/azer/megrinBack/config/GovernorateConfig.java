package com.azer.megrinBack.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import com.azer.megrinBack.entities.Governorate;
import com.azer.megrinBack.repository.GovernorateRepository;

@Configuration
public class GovernorateConfig {

    @Bean
    CommandLineRunner governorateCommandLineRunner(GovernorateRepository repository) {
        return args -> {
            // Governorate Ariana = new Governorate("Ariana", 1L);
            // Governorate Beja = new Governorate("Beja", 1L);
            // Governorate BenArous = new Governorate("Ben Arous", 1L);
            // Governorate Bizerte = new Governorate("Bizerte", 1L);
            // Governorate Gabes = new Governorate("Gabes", 1L);
            // Governorate Gafsa = new Governorate("Gafsa", 1L);
            // Governorate Jendouba = new Governorate("Jendouba", 1L);
            // Governorate Kairouan = new Governorate("Kairouan", 1L);
            // Governorate Kasserine = new Governorate("Kasserine", 1L);
            // Governorate Kebili = new Governorate("Kebili", 1L);
            // Governorate Kef = new Governorate("Kef", 1L);
            // Governorate Mahdia = new Governorate("Mahdia", 1L);
            // Governorate Manouba = new Governorate("Manouba", 1L);
            // Governorate Medenine = new Governorate("Medenine", 1L);
            // Governorate Monastir = new Governorate("Monastir", 1L);
            // Governorate Nabeul = new Governorate("Nabeul", 1L);
            // Governorate Sfax = new Governorate("Sfax", 1L);
            // Governorate SidiBouzid = new Governorate("Sidi Bouzid", 1L);
            // Governorate Siliana = new Governorate("Siliana", 1L);
            // Governorate Sousse = new Governorate("Sousse", 1L);
            // Governorate Tataouine = new Governorate("Tataouine", 1L);
            // Governorate Tozeur = new Governorate("Tozeur", 1L);
            // Governorate Tunis = new Governorate("Tunis", 1L);
            // Governorate Zaghouan = new Governorate("Zaghouan", 1L);
            
            // repository.saveAll(
            //     List.of(Ariana, Beja, BenArous, Bizerte, Gabes, Gafsa, Jendouba, Kairouan, Kasserine, Kebili, Kef, Mahdia, Manouba, Medenine, Monastir, Nabeul, Sfax, SidiBouzid, Siliana, Sousse, Tataouine, Tozeur, Tunis, Zaghouan)
            // );
        };
    }
}
