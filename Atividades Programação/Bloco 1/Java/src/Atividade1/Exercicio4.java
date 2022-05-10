package Atividade1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4-Faça um programa em que permita a entrada de um número qualquer
		 *  e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
		 *  se for ímpar exiba o número elevado ao quadrado.
		 */
			
		Scanner leia = new Scanner(System.in);
		
		int num;
		double r;
		
		System.out.println("\nEntre com um numero: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("\nEste número é par.");
			r = Math.sqrt(num);
			System.out.printf("\nO valor da média é: %.2f", r);
		}
		else {
			System.out.println("\nEste número é impar.");
			r = Math.pow(num, 2);
			System.out.printf("\nO quadrado desse número é: %.2f" r);
		}
	}

}
