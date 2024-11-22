package org.example.tp_3;

import org.example.tp_3.entities.Patient;
import org.example.tp_3.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class Tp3Application {

    public static void main(String[] args) {

        SpringApplication.run(Tp3Application.class, args);
    }

    //@Bean
     CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(new Patient(null, "HASSSAN", new Date(), Boolean.FALSE, 12));
            patientRepository.save(new Patient(null, "ALI", new Date(), Boolean.TRUE, 34));
            patientRepository.save(new Patient(null, "ALKHER", new Date(), Boolean.FALSE, 250));
            patientRepository.save(new Patient(null, "MARWAN", new Date(), Boolean.TRUE, 102));

            patientRepository.findAll().forEach(p -> {
                System.out.println(p.getNom());

            });
        };

    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
