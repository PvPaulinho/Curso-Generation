package Atividade1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4-Fa�a um programa em que permita a entrada de um n�mero qualquer
		 *  e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
		 *  se for �mpar exiba o n�mero elevado ao quadrado.
		 */
			
		Scanner leia = new Scanner(System.in);
		
		int num;
		double r;
		
		System.out.println("\nEntre com um numero: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("\nEste n�mero � par.");
			r = Math.sqrt(num);
			System.out.printf("\nO valor da m�dia �: %.2f", r);
		}
		else {
			System.out.println("\nEste n�mero � impar.");
			r = Math.pow(num, 2);
			System.out.printf("\nO quadrado desse n�mero �: %.2f" r);
		}
	}

}
