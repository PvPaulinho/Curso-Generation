package Atividade5E1;

public class Cachorro extends Animal {

	// Declarando m�todo construtor
	public Cachorro (String nome, int idade) {
		super(nome, idade);
	}
	
	// Definindo novos m�todos
	public void imprimirInfoCachorro() {
		System.out.println("\nNome do cachorro: " + getNome() + "\nIdade do cachorro: " + getIdade());
	}
	
	public void emitirSom () {
		System.out.println("Au ... Au");
	}
	
	public void acao () {
		System.out.println("Correndo");
	}
}
