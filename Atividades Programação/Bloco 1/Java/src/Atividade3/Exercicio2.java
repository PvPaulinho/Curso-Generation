package Atividade3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int [] num = new int[6];
		int somapar = 0,contimpar = 0;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\nEntre com um n�mero: ");
			num[i] = leia.nextInt();
		}
		System.out.println("\nOs n�meros pares s�o: ");
		for (int i = 0; i < 6; i++) {
			if (num[i] % 2 == 0) {
				somapar = somapar + num[i];
				System.out.println(num[i]);
			}
		}
		System.out.println("\nA soma dos n�meros pares �: " + somapar);
		System.out.println("\nOs n�meros impares s�o: ");
		for (int i = 0; i < 6; i++) {
			if (num[i] % 2 != 0) {
				contimpar++;
				System.out.println(num[i]);
			}
		}
		System.out.println("\nA quantidade de n�meros impares �: " + contimpar);
	}

}
