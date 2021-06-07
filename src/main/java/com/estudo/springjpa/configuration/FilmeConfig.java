package com.estudo.springjpa.configuration;

import com.estudo.springjpa.model.Filme;
import com.estudo.springjpa.repository.FilmeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FilmeConfig {

    @Bean
    CommandLineRunner commandLineRunner(FilmeRepository filmeRepository) {
        return args -> {
            Filme filme1 = new Filme("Eyes Wide Shut", 12, "Sim", "Sim", 10.2, "Kubrick", "1999", 18, "Suspense");
            Filme filme2 = new Filme("Beleza Americana", 12, "Sim", "Sim", 10.2, "Robert Deniro", "1988", 18, "Drama");
            Filme filme3 = new Filme("Cidade de Deus", 12, "Sim", "Sim", 10.2, "Jozé com Z", "2002", 18, "Ação");

            filmeRepository.saveAll(
                    List.of(filme1, filme2, filme3)
            );

        };
    }
}
