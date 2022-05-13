package Atividade5E1;

public class Cachorro extends Animal {
	// Declarando atributo da sub-classe Cachorro
	private String latir;
	private String correr;
	
	// Declarando método construtor
	public Cachorro (String nome, int idade, String latir, String correr) {
		super(nome, idade);
		this.latir = latir;
		this.correr = correr;
	}
	
	// Definindo novos métodos
	public String getLatir() {
		return latir;
	}

	public void setLatir(String latir) {
		this.latir = latir;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfoCachorro() {
		System.out.println("\nNome do cachorro: " + getNome() + "\nIdade do cachorro: " + getIdade()
				+ "\nLatido do cachorro: " + latir);
	}
	
	public void DeveCorrer (String correr) {
		System.out.println("\nO cachorro corre " + correr);
	}
}
