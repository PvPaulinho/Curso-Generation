package Atividade1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//1-Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int i1, i2, i3;
		
		System.out.println("\nEntre com o primeiro numero: ");
		i1 = leia.nextInt();
		System.out.println("\nEntre com o segundo numero: ");
		i2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro numero: ");
		i3 = leia.nextInt();
		
		if (i1 > i2 && i1 > i3) {
			System.out.println("\nO maior número é o: " + i1);
		}
		else if (i2 > i1 && i2 > i3) {
			System.out.println("\nO maior número é o: " + i2);
		}
		else if (i3 > i1 && i3 > i2) {
			System.out.println("\nO maior número é o: " + i3);
		}
		else {
			System.out.println("\nNão existe um número maior que todos os outros: ");
		}

	}

}
