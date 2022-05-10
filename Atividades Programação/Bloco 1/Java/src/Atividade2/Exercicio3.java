package Atividade2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	/*
	 * 3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
	 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
	 */
		
		int idade, cont21 = 0, cont50 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a idade da pessoa: ");
		idade = leia.nextInt();
		
		while(idade != -99){
			if (idade < 21 && idade > 0) {
				cont21++;
			}
			if (idade > 50) {
				cont50++;
			}
			System.out.println("\nSe deseja encerrar digite -99, caso deseje continuar, digite a idade de outra pessoa: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nO número de pessoas com idade abaixo de 21 anos é: " + cont21);
		System.out.println("\nO número de pessoas com idade acima de 50 anos é: " + cont50);
	}

}
