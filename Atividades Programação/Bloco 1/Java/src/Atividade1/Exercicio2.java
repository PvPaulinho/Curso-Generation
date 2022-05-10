package Atividade1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//2 - Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("\nEntre com o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo numero: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro numero: ");
		n3 = leia.nextInt();
		
		if (n1 <= n2 && n1 <= n3) {
			if (n2 <= n3) {
				System.out.println("\nA ordem dos numeros é: " + n1 + ", " + n2 + ", " + n3);
			}
			else {
				System.out.println("\nA ordem dos numeros é: " + n1 + ", " + n3 + ", " + n2);
			}
		}
		else if (n2 <= n1 && n2 <= n3) {
			if (n1 <= n3) {
				System.out.println("\nA ordem dos numeros é: " + n2 + ", " + n1 + ", " + n3);
			}
			else {
				System.out.println("\nA ordem dos numeros é: " + n2 + ", " + n3 + ", " + n1);
			}
		}
		else {
			if (n1 <= n2) {
				System.out.println("\nA ordem dos numeros é: " + n3 + ", " + n1 + ", " + n2);
			}
			else {
				System.out.println("\nA ordem dos numeros é: " + n3 + ", " + n2 + ", " + n1);
			}
		}
	}

}
