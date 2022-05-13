package Atividade5E1;

public class Preguica extends Animal {
	// Declarando atributo da sub-classe Preguiça
	private String gritos;
	private String subirEmArvores;
	
	// Declarando método construtor
	public Preguica (String nome, int idade, String gritos, String subirEmArvores) {
		super(nome, idade);
		this.gritos = gritos;
		this.subirEmArvores = subirEmArvores;
	}

	// Definindo novos métodos
	public String getGritos() {
		return gritos;
	}

	public void setGritos(String gritos) {
		this.gritos = gritos;
	}

	public String getSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(String subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}
	
	public void imprimirInfoPreguica() {
		System.out.println("\nNome da Preguiça: " + getNome() + "\nIdade da Preguiça: " + getIdade()
				+ "\nOs gritos da Preguiça: " + gritos);
	}
	
	public void DeveCorrer (String correr) {
		System.out.println("\nA Preguiça sobe em arvares " + subirEmArvores);
	}
}
