package com.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Indica para o Spring que o objeto criado vai se tornar uma tabela no banco de dados 
@Table(name = "tb_postagem") // Indica o nome da tabela 
public class Postagem {
	
	@Id // Indica que o campo id será a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // equivale ao auto-incremente no MySQL
	private long id;
	
	@NotNull // Indica que não pode ser nulo
	// @NotEmpty - Indica que o campo não pode estar vazio
	// @NotBlank - Indica que o campo não pode estar em branco
	
	@Size(min = 1, max = 100) // Indica quantidade de caracteres que pode ter no texto
	private String titulo;
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	
	
}
