package Atividade3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int [] num = new int[6];
		int somapar = 0,contimpar = 0;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\nEntre com um número: ");
			num[i] = leia.nextInt();
		}
		System.out.println("\nOs números pares são: ");
		for (int i = 0; i < 6; i++) {
			if (num[i] % 2 == 0) {
				somapar = somapar + num[i];
				System.out.println(num[i]);
			}
		}
		System.out.println("\nA soma dos números pares é: " + somapar);
		System.out.println("\nOs números impares são: ");
		for (int i = 0; i < 6; i++) {
			if (num[i] % 2 != 0) {
				contimpar++;
				System.out.println(num[i]);
			}
		}
		System.out.println("\nA quantidade de números impares é: " + contimpar);
	}

}
