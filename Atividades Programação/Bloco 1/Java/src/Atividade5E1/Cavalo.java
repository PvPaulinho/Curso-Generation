package Atividade5E1;

public class Cavalo extends Animal {
	// Declarando método construtor
	public Cavalo (String nome, int idade) {
		super(nome, idade);
	}
	
	// Definindo novos métodos
	public void imprimirInfoCavalo() {
		System.out.println("\nNome do cavalo: " + getNome() + "\nIdade do cavalo: " + getIdade());
	}
	
	public void emitirSom () {
		System.out.println("hinn in in ...");
	}
	
	public void acao () {
		System.out.println("Correndo a galopes");
	}
}
