package com.generation.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indica que a classe abaixo é uma classe controladora
@RequestMapping ("/hellow") //Serve para construir os endPoints da api
public class HelloWorld {
	
	@GetMapping // Para usar get
	public String hello() {
		return "Hello World!<br><br>Mentalidades:<br>&nbsp&nbsp&nbsp&nbsp&nbsp - Orientação ao Futuro<br>"
				+ "&nbsp&nbsp&nbsp&nbsp&nbsp - Responsabilidade pessoal<br>&nbsp&nbsp&nbsp&nbsp&nbsp - "
				+ "Mentalidade de crescimento<br>&nbsp&nbsp&nbsp&nbsp&nbsp - Persistência<br><br>"
				+ "Habilidades:<br>&nbsp&nbsp&nbsp&nbsp&nbsp - Trabalho em equipe<br>"
				+ "&nbsp&nbsp&nbsp&nbsp&nbsp - Orientação ao detalhe<br>&nbsp&nbsp&nbsp&nbsp&nbsp - "
				+ "Proatividade<br>&nbsp&nbsp&nbsp&nbsp&nbsp - Comunicação";
	}
	
	
	
}
