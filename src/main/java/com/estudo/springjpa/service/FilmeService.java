package com.estudo.springjpa.service;

import com.estudo.springjpa.model.Filme;
import com.estudo.springjpa.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    private final FilmeRepository filmeRepository;

    @Autowired
    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public List<Filme> getFilmes() {
        return filmeRepository.findAll();
    }

    public void addFilme(Filme filme) {
        filmeRepository.save(filme);
    }
}
