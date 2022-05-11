package Atividade4E1;

public class Cliente {

	// Declarando os atributos
	private String nome;
	private int idade;
	private int cpf;
	
	// Declara��o do m�todo construtor
	public Cliente (String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	// Declara��o de outros m�todos
	public void exibirInforma��es () {
		System.out.println("\n\t*****Informa��es do cliente*****");
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
