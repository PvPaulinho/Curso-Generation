package Atividade5E1;

public class Preguica extends Animal {
	// Declarando atributo da sub-classe Pregui�a
	private String gritos;
	private String subirEmArvores;
	
	// Declarando m�todo construtor
	public Preguica (String nome, int idade, String gritos, String subirEmArvores) {
		super(nome, idade);
		this.gritos = gritos;
		this.subirEmArvores = subirEmArvores;
	}

	// Definindo novos m�todos
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
		System.out.println("\nNome da Pregui�a: " + getNome() + "\nIdade da Pregui�a: " + getIdade()
				+ "\nOs gritos da Pregui�a: " + gritos);
	}
	
	public void DeveCorrer (String correr) {
		System.out.println("\nA Pregui�a sobe em arvares " + subirEmArvores);
	}
}
