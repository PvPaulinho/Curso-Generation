package com.generation.blogpessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.generation.blogpessoal.model.Usuario;
import com.generation.blogpessoal.model.UserLogin;
import com.generation.blogpessoal.repository.UsuarioRepository;
import com.generation.blogpessoal.service.UsuarioService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // Indica que a classe é uma SpringBootTest, e webEnvironment serve apra que se a porta 8080 estiver sendo usada ele vai usar uma outra aleatória
@TestInstance(TestInstance.Lifecycle.PER_CLASS)  //Indica que o ciclo de vida de Teste será por classe (um único ciclo de vida enquanto o teste está em execução)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate; // Envia as requisições dos Requests para dentro da nossa aplicação

	
	@Autowired
	private UsuarioService usuarioService; // Injetando o objeto da classe UsuarioService para persistir o objeto no banco de dados de Teste com a senha criptografada
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		usuarioRepository.deleteAll();
	}
	
	@Test
	@Order(1)
	@DisplayName("Cadastrar um Usuario")
	public void deveCriarUmUsuario() {
		HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(new Usuario(
				0L, "Paulo Silva", "pvictor40@gmail.com","12345678"));
		ResponseEntity<Usuario> corpoResposta = testRestTemplate.exchange("/usuarios/cadastrar", 
				HttpMethod.POST, corpoRequisicao, Usuario.class);
		assertEquals(HttpStatus.CREATED, corpoResposta.getStatusCode());
		assertEquals(corpoRequisicao.getBody().getNome(), corpoResposta.getBody().getNome());
		assertEquals(corpoRequisicao.getBody().getSenha(), corpoResposta.getBody().getSenha());
		assertEquals(corpoRequisicao.getBody().getUsuario(), corpoResposta.getBody().getUsuario());
	}
	
	@Test
	@Order(2)
	@DisplayName("Não deve permitir duplicação do Usuario")
	public void naoDeveDuplicarUsuario() {
		usuarioService.cadastrarUsuario(new Usuario(0L, "Paulo",
				"pvictor41@gmail.com", "12345678"));
		HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(new Usuario(0L, "Paulo",
				"pvictor41@gmail.com", "12345678"));
		ResponseEntity<Usuario> corpoResposta = testRestTemplate.exchange("/usuarios/cadastrar", 
				HttpMethod.POST, corpoRequisicao, Usuario.class);
		assertEquals(HttpStatus.BAD_REQUEST, corpoResposta.getStatusCode());
	}
	
	@Test
	@Order(3)
	@DisplayName("Altualizar um Usuario")
	public void deveAtualizarUmUsuario() {
		Optional<Usuario> usuarioCadastrado = usuarioService.cadastrarUsuario(new Usuario(0L, 
				"Paulo Victor Silva", "pvictor37@gmail.com", "12345678"));
		Usuario usuarioUpdate = new Usuario(usuarioCadastrado.get().getId(), 
				"Paulo Victor Silva", "pvictor38@gmail.com", "12345678");
		HttpEntity<Usuario> corpoRequisicao = new HttpEntity<Usuario>(usuarioUpdate);
		ResponseEntity<Usuario> corpoResposta = testRestTemplate.withBasicAuth("root", "root")
				.exchange("/usuarios/atualizar", HttpMethod.PUT, corpoRequisicao, Usuario.class);
		assertEquals(HttpStatus.OK, corpoResposta.getStatusCode());
		assertEquals(usuarioUpdate.getNome(), corpoResposta.getBody().getNome());
		assertEquals(usuarioUpdate.getSenha(), corpoResposta.getBody().getSenha());
		assertEquals(usuarioUpdate.getUsuario(), corpoResposta.getBody().getUsuario());
	}
	
	@Test
	@Order(4)
	@DisplayName("Listar todos os usuarios")
	public void deveMostrarTodosOsUsuarios() {
		usuarioService.cadastrarUsuario(new Usuario(0L, "Paulo", "pvictor38@gmail.com", "12345678"));
		usuarioService.cadastrarUsuario(new Usuario(0L, "Paulo Victor", "pvictor39@gmail.com", "12345678"));
		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("root", "root")
				.exchange("/usuarios", HttpMethod.GET, null, String.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	@Test
	@Order(5)
	@DisplayName("Listar Um Usuário Específico")
	public void deveListarApenasUmUsuario() {
		Optional<Usuario> usuarioBusca = usuarioService.cadastrarUsuario(new Usuario(0L, 
				"Laura Santolia", "laura_santolia@email.com.br", "laura12345"));
		ResponseEntity<String> resposta = testRestTemplate.withBasicAuth("root", "root")
				.exchange("/usuarios/" + usuarioBusca.get().getId(), 
						HttpMethod.GET, null, String.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	@Test
	@Order(6)
	@DisplayName("Login do Usuário")
	public void deveAutenticarUsuario() {
		usuarioService.cadastrarUsuario(new Usuario(0L, 
				"Marisa Souza", "marisa_souza@email.com.br", "13465278"));
		HttpEntity<UserLogin> corpoRequisicao = new HttpEntity<UserLogin>(new UserLogin(0L, 
				"", "marisa_souza@email.com.br", "13465278", ""));
		ResponseEntity<UserLogin> corpoResposta = testRestTemplate
				.exchange("/usuarios/logar", HttpMethod.POST, corpoRequisicao, UserLogin.class);
		assertEquals(HttpStatus.OK, corpoResposta.getStatusCode());
	}
}
