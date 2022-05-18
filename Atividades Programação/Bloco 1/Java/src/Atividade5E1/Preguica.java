package Atividade5E1;

public class Preguica extends Animal {
	
	// Declarando m�todo construtor
	public Preguica (String nome, int idade) {
		super(nome, idade);
	}
	
	// Definindo novos m�todos
	public void imprimirInfoPreguica() {
		System.out.println("\nNome do preguica: " + getNome() + "\nIdade do preguica: " + getIdade());
	}
	
	public void emitirSom () {
		System.out.println("AaA ... AaA");
	}
	
	public void acao () {
		System.out.println("Subindo em arvore");
	}
}
