package Atividade2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 6-Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int num, soma = 0, cont = 0;
		float media;
		
		do {
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			if (num % 3 == 0 && num != 0) {
				soma = soma + num;
				cont++;
			}
		}while(num != 0);
		
		media = soma/cont;
		System.out.println("\nA m�dia dos n�meros multiplos de 3 digitados �: " + media);
	}

}
