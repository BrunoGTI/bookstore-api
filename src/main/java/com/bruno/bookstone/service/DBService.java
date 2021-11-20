package com.bruno.bookstone.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.bookstone.domain.Categoria;
import com.bruno.bookstone.domain.Livro;
import com.bruno.bookstone.repositories.CategoriaRepository;
import com.bruno.bookstone.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;


	public void instaciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro de TI");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
	}
	
}
