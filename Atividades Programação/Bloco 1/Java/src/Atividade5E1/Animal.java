package Atividade5E1;

public class Animal {

	// Declarando os atributos da classe animal
	private String nome;
	private int idade;
	
	// Declarando o método construtor
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	// Declaração de get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
