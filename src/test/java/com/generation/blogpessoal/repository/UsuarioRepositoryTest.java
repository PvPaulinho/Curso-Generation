package com.generation.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.generation.blogpessoal.model.Usuario;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		usuarioRepository.deleteAll();
		usuarioRepository.save(new Usuario(0L, "Paulo", "pvictor36@gmail.com", "12345678",
				"https://avatars.githubusercontent.com/u/89820996?v=4"));
		usuarioRepository.save(new Usuario(0L, "Paulo Victor Silva", "pvictor35@gmail.com", 
				"12345678", "https://avatars.githubusercontent.com/u/89820996?v=4"));
		usuarioRepository.save(new Usuario(0L, "Paulo Damasceno Silva", "pvictor34@gmail.com",
				"12345678", "https://avatars.githubusercontent.com/u/89820996?v=4"));
		usuarioRepository.save(new Usuario(0L, "Paulo Silva", "pvictor40@gmail.com", "12345678",
				"https://avatars.githubusercontent.com/u/89820996?v=4"));
	}
	
	@Test
	@DisplayName("Retorna 1 usuário")
	public void deveRetornarUmUsuario() {
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("pvictor36@gmail.com");
		assertTrue(usuario.get().getUsuario().equals("pvictor36@gmail.com"));
	}
	
	@Test
	@DisplayName("Retorna 3 usuário")
	public void deveRetornarTresUsuario() {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Silva");
		assertEquals(3, listaDeUsuarios.size());
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Paulo Victor Silva"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Paulo Damasceno Silva"));
		assertTrue(listaDeUsuarios.get(2).getNome().equals("Paulo Silva"));
	}
	
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
}
