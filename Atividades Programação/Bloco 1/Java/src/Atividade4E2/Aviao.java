package Atividade4E2;

public class Aviao {

	// Adicionando atributos da classe
	private String codigo;
	private String marca;
	private double tamanho;
	private double peso;
	private int numeroMaxPassageiros;
	
	// Declaração do método construtor
	public Aviao (String codigo, String marca, double tamanho, double peso, int numeroMaxPassageiros) {
		this.codigo = codigo;
		this.marca = marca;
		this.tamanho = tamanho;
		this.peso = peso;
		this.numeroMaxPassageiros = numeroMaxPassageiros;
	}
	
	// Declaração de outro métodos
	public void exibirAviao() {
		System.out.println("\nAvião: " + codigo + "\nMarca: " + marca + "\nTamanho: " + tamanho + "\nPeso: " + peso + "\nNumero Máximo de Passageiros: " + numeroMaxPassageiros);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNumeroMaxPassageiros() {
		return numeroMaxPassageiros;
	}

	public void setNumeroMaxPassageiros(int numeroMaxPassageiros) {
		this.numeroMaxPassageiros = numeroMaxPassageiros;
	}
}
