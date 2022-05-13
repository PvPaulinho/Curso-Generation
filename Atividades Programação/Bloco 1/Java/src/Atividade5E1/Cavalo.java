package Atividade5E1;

public class Cavalo extends Animal {
	// Declarando atributo da sub-classe Cavalo
	private String relinchar;
	private String correr;
	
	// Declarando método construtor
	public Cavalo (String nome, int idade, String relinchar, String correr) {
		super(nome, idade);
		this.relinchar = relinchar;
		this.correr = correr;
	}

	// Definindo novos métodos
	public String getRelinchar() {
		return relinchar;
	}

	public void setRelinchar(String relinchar) {
		this.relinchar = relinchar;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfoCavalo() {
		System.out.println("\nNome do cavalo: " + getNome() + "\nIdade do cavalo: " + getIdade()
				+ "\nO relinchar do cavalo: " + relinchar);
	}
	
	public void DeveCorrer (String correr) {
		System.out.println("\nO cavalo corre " + correr);
	}
}
