package Atividade1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int i1, i2, i3;
		
		System.out.println("\nEntre com o primeiro numero: ");
		i1 = leia.nextInt();
		System.out.println("\nEntre com o segundo numero: ");
		i2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro numero: ");
		i3 = leia.nextInt();
		
		if (i1 > i2 && i1 > i3) {
			System.out.println("\nO maior n�mero � o: " + i1);
		}
		else if (i2 > i1 && i2 > i3) {
			System.out.println("\nO maior n�mero � o: " + i2);
		}
		else if (i3 > i1 && i3 > i2) {
			System.out.println("\nO maior n�mero � o: " + i3);
		}
		else {
			System.out.println("\nN�o existe um n�mero maior que todos os outros: ");
		}

	}

}
