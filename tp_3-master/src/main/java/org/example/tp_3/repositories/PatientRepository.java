package org.example.tp_3.repositories;

import org.example.tp_3.entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface PatientRepository extends JpaRepository<Patient, Long> {


    Page<Patient> findByNomContains(String kwd, Pageable pageable);
}
