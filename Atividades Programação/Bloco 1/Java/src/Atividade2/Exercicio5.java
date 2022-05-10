package Atividade2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 5-Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			soma = soma + num;
		}while (num != 0);
		System.out.println("\nA soma dos números digitados é: " + soma);
	}
}
