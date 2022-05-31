package com.generation.blogpessoal.controller;

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

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController // Indica que a classe é uma classe controladora (Onde ficam os Endpoints)
@CrossOrigin(origins = "*") // Permite que requisições de outras portas sejam aceitas na minha aplicação
@RequestMapping("/postagens") // Cria um Endpoint
public class PostagemController {

	@Autowired // Funciona como injeção de dependencia, transferindo a responsabilidade de modificação do banco de dados para a classe a baixo
	private PostagemRepository repository;
	
	@GetMapping // Indica o verbo que pode ser utilizado no endpoint
	public ResponseEntity<List<Postagem>> buscaPostagem () {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") // Indica o verbo espeífico indicado, que pode ser utilizado no endpoint
	public ResponseEntity<Postagem> buscaPostagemPorId(@PathVariable Long id){
		return repository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> buscaPostagemPorTitulo (@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping // Para adicionar um novo item
	public ResponseEntity<Postagem> adicionaPostagem (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping // Indica o item para atualizar um idem
	public ResponseEntity<Postagem> atualizarPostagem (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	@DeleteMapping("/{id}") // Indica o item a ser deletado
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
