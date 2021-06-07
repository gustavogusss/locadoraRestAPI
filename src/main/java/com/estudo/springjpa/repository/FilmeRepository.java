package com.estudo.springjpa.repository;

import com.estudo.springjpa.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
