package com.example.demo;

import com.example.demo.DTO.EtudiantDTO;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Repositories.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner start(EtudiantRepository etudiantRepository){
		return args -> {
			//Etudiant e = new Etudiant(null,"Hamid","Hamid","5eme","k11234567","hamid@gmail.com");
			etudiantRepository.save(Etudiant.builder().nom("HAMID").prenom("Hamid").cne("K1234567").email("hamid@gmail.com")
							.niveau("5eme").build());
			etudiantRepository.save(Etudiant.builder().nom("AYA").prenom("Aya").cne("K987654").email("aya@gmail.com")
					.niveau("5eme").build());
			etudiantRepository.save(Etudiant.builder().nom("HASSAN").prenom("Hasan").cne("B765456").email("hassan@gmail.com")
					.niveau("5eme").build());
			etudiantRepository.save(Etudiant.builder().nom("SAMIRA").prenom("Samira").cne("E53456").email("samira@gmail.com")
					.niveau("5eme").build());
		};
	}
}
