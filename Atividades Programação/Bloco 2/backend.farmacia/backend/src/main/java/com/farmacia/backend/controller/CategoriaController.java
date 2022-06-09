package com.farmacia.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.backend.model.Categoria;
import com.farmacia.backend.repository.CategoriaRepository;

@RequestMapping
@CrossOrigin(origins = "*")
@RestController
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> buscaCategoria(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("!/{id}")
	public ResponseEntity<Categoria> buscaPorId (@PathVariable long id){
		return repository.findById(id)
				.map(reposta -> ResponseEntity.ok(reposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome_categoria{come_categoria}")
	public ResponseEntity<List<Categoria>> buscaPorNomeCategoria (@PathVariable String nome_categoria){
		return ResponseEntity.ok(repository.findAllByNomeCategoriaContainingIgnoreCase(nome_categoria));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> adicionarCategoria (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> atualizarCategoria (@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@DeleteMapping("/id")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
