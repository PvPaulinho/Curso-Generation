package Atividade4E1;

public class Cliente {

	// Declarando os atributos
	private String nome;
	private int idade;
	private int cpf;
	
	// Declaração do método construtor
	public Cliente (String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	// Declaração de outros métodos
	public void exibirInformações () {
		System.out.println("\n\t*****Informações do cliente*****");
		System.out.println("\n\nNome do cliente: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf);
	}

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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
