package Atividade1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
/*
 * 3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
			•	10-14 infantil
			•	15-17 juvenil
			•	18-25 adulto
 */
			
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("\nSe encontra na categoria infantil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("\nSe encontra na categoria juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("\nSe encontra na categoria adulto.");
		}
		else {
			System.out.println("\nNão se enquadra em nenhuma das categorias.");
		}
		
	}

}
