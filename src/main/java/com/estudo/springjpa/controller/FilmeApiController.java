package com.estudo.springjpa.controller;

import com.estudo.springjpa.model.Filme;
import com.estudo.springjpa.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/filmes")
public class FilmeApiController {
    private final FilmeService filmeService;

    @Autowired
    public FilmeApiController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping
    public List<Filme> list() {
        return filmeService.getFilmes();
    }

    @PostMapping
    public void postFilme(@RequestBody Filme filme) {
        filmeService.addFilme(filme);
    }
}
