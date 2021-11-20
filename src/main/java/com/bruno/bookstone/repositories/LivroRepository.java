package com.bruno.bookstone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.bookstone.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
